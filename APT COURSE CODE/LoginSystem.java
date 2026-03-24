import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "adminKE";
        String correctPassword = "254Secure";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }

        input.close();
    }
}
