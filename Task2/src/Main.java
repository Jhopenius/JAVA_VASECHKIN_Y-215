import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the array size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] arr = new double[size];

        // Заполнение массива рандомными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 31) - 15);
        }

        // Вывод массива
        System.out.println("Array before: ");
        System.out.println(Arrays.toString(arr));

        // Перенос положительных чисел в другой массив
        int counter = 0;
        double[] arrEnd = new double[arr.length];
        for (int i = 0; i < arrEnd.length; i++) {
            if (arr[i] > 0) {
                arrEnd[counter] = arr[i] / 5;
                counter++;
            }
        }
        // Сжатие массива
        arrEnd = Arrays.copyOf(arrEnd, counter);

        // Selection sort
        for (int left = 0; left < arrEnd.length; left++) {
            int minInd = left;
            for (int i = left; i < arrEnd.length; i++) {
                if (arrEnd[i] < arrEnd[minInd]) {
                    minInd = i;
                }
            }
            swap(arrEnd, left, minInd);
        }

        System.out.println("Array after: ");
        System.out.println(Arrays.toString(arrEnd));
    }

    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}