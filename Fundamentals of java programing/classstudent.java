import java.util.Scanner;

class Student{
    //data member function
    int studentID;
    String studentName;
    int studentAge;

    Scanner sc = new Scanner(System.in);
    //member function
    public void acceptDetails(){

        System.out.println("Enter Student ID: ");
        studentID = sc.nextInt();
        System.out.println("Enter student name: ");
        studentName = sc.next();
        System.out.println("Enter the age: ");
        studentAge = sc.nextInt();

    }
    public void displayDetails(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student name: "+studentName);
        System.out.println("Student age: "+studentAge);
    }

}

public class classstudent {
    public static void main(String[] args) {
        //create and abject of class student 

        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
    }
    
}
