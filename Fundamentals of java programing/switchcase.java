import java.util.Scanner;

public class switchcase {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choise");
        String user = scanner.nextLine();

        switch (user) {
            case "a":
                System.out.println('a');
                break;
            case "b":
            System.out.println("b");
                break;
            default:
                System.out.println("Not a");
        }
    }
    
}
