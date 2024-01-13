import java.util.Scanner;


class Student {

    int studentID;
    String studentName;
    int studentAge;

    Scanner sc = new Scanner(System.in);

public Student() /* constructor default */
    {
        this(101,"kartik",24);
        this.studentID = 100;
        this.studentName = "Idiot";
        this.studentAge = 21;
    }

    // parameter constructor
    public Student(int sID, String sName, int sAge) {
        this(102,29,"Gautam");
        this.studentID = sID;
        this.studentName = sName;
        this.studentAge = sAge;
    }
    public Student(int sID, int sAge, String sName) {
        this.studentID = sID;
        this.studentName = sName;
        this.studentAge = sAge;
    }

    void displayDetails() {
        System.out.println("Student ID :" + studentID);
        System.out.println("Student name :" + studentName);
        System.out.println("Student Age :" + studentAge);
    }

    
}

class Marks extends Student{
    private float objectiveMarks;
    private float subjectiveMarks;

    void acceptDetails1(){
        System.out.println("Enter student objective Marks: ");
        objectiveMarks = sc.nextFloat();
        System.out.println("Enter student subjective marks: ");
        subjectiveMarks = sc.nextFloat();
    }
    void displayDetails1(){
        System.out.println("Student objective marks: "+objectiveMarks);
        System.out.println("Student subjective marks: "+subjectiveMarks);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        

        // Student student = new Student();
        Marks marks = new Marks();
        marks.acceptDetails1();
        marks.displayDetails1();
    }

}
