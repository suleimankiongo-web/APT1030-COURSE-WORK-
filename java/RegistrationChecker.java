import java.util.Scanner;

// Same program as the other folders, just in Java
public class RegistrationChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of registered units: ");
        int numUnits = scanner.nextInt();

        String registrationStatus;
        if (numUnits > 7) {
            registrationStatus = "Overload - Approval Required";
        } else {
            registrationStatus = "Registration Accepted";
        }

        System.out.println();
        System.out.println("--- Final Summary ---");
        System.out.println("Student: " + studentName);
        System.out.println("Units: " + numUnits);
        System.out.println("Status: " + registrationStatus);

        scanner.close();
    }
}
