import java.util.Scanner;

public class looping_statement {
    public static void main(String[] args) {
        // int []arr = {1,2,3,4,5,6};

        // // using for loop
        // System.out.println("For Loop");
        // for(int i = 0; i<arr.length;i++){
        //     System.out.print(arr[i]+"\t");
        // }
        // System.out.println();

        // System.out.println("While loop");
        // int i=0;
        // while (i<arr.length) {
        //     System.out.print(arr[i]+"\t");
        //     i++;
        // }
        // System.out.println();

        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.println("Enter Message: ");
            input = sc.nextLine().toLowerCase();
            System.out.println(input);
        }




    }
}
