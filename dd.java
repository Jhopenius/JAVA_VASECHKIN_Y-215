public class dd {
    public static void main(String[] args) {
        String log; 
        String pass;

        log = "u1";
        pass = "p1";

        if ((log.equals(args[0])) & (pass.equals(args[1]))) {
            System.out.print("\t\tВас узнали. Добро пожаловать!");
        }
        else {
            System.out.print("\t\tЛогин и пароль не распознаны. Доступ запрещён.");
        }

    }
}