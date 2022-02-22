import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите им€: ");
        String name = in.nextLine();

        if (name != "") {
            System.out.println("\tHello, "+ name + "!");
        }
        else {
            System.out.println("\tHello, World!");
        }

        in.close();
    }
}