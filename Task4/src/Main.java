import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Инициализация матрицы
        System.out.print("Enter the matrix size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[][] matrix = new double[size][size];

        //Заполнение матрицы рандомными числами
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ((int)(Math.random() * 31) - 15);
            }
        }

        //Вывод матрицы
        System.out.println("Matrix before: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Нахождение количество положительных элементов в главной диагонали
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] > 0) {
                        counter++;
                    }
                }
            }
        }

        //Умножение побочной диагонали на количество, найденное в предыдущем цикле
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    matrix[i][j] *= counter;
                }
            }
        }

        //Вывод матрицы
        System.out.println("Matrix after: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}