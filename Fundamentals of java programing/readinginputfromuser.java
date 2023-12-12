import java.util.Scanner;

public class readinginputfromuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter Gender");
        String genderInput = scanner.next();
        char gender = genderInput.charAt(0);

        System.out.println("Enter yout contact number");
        double contact = scanner.nextDouble();

        System.out.println("User Details");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Contact: " + contact);

    }
}
