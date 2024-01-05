import java.util.Scanner;

public class jump_statement {
    public static void main(String[] args) {
        // break and continue 

        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            
            System.out.println("Enter Message: ");
            input = sc.nextLine().toLowerCase();

            if(input.equals("quit")){
                break;
            }
              if(input.equals("pass")){
                continue;
            }

            System.out.println(input);
        }
    }
    
}
