import java.util.Scanner;

public class fizzbuss_problem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int input = sc.nextInt();

        for(int i = 1 ;i<=input;i++)
        {

        if(i %15 == 0){
            System.out.print("FizzBuzz ");
        }

        else if (i % 5 == 0) {
            System.out.print("Buzz ");
        }

        else if (i % 3 == 0) {
            System.out.print("Fizz ");
        }
        else{
            System.out.print(i+" ");
        }
    }
}
    
}
