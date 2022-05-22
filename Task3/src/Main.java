
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Инициализация матрицы
        System.out.print("Enter the row size: ");
        Scanner scan = new Scanner(System.in);
        int sizeRow = scan.nextInt();
        System.out.print("Enter the column size: ");
        int sizeColumn = scan.nextInt();
        double[][] matrix = new double[sizeRow][sizeColumn];

        //Заполнение матрицы рандомными числами
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ((int)(Math.random() * 31) - 15);
            }
        }
        // Вывод матрицы
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Нахождение максимального значения в i-той строке
        System.out.print("Enter the row: ");
        int rowNumber = scan.nextInt() - 1;
        double max = 0;
        int answer = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[rowNumber][i] > max) {
                max = matrix[rowNumber][i];
                answer = i;
            }
        }
        System.out.printf("Answer = %s", answer + 1);
    }
}