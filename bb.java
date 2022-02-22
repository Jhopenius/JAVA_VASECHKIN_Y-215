import java.util.Scanner;

public class bb {
    public static void main(String[] args) {
        int N = 0;
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();

        while (x != "") {
            x = in.nextLine();
            N++;
        }

        if (N != 0) {
            System.out.print("\tВы ввели "+ N +" параметров!");
        }
        else {
            System.out.print("\tВы не передавали параметров.");
        }

        in.close();
    }
}