/**
 * Student
 * 
 * 
 * private int studentID;
 * private String studentName;
 * private int studentAge;
 * 
 * void displayDetails(){
 */
class Student {

    private int studentID;
    private String studentName;
    private int studentAge;

    public Student() /* constructor default */
    {
        this.studentID = 100;
        this.studentName = "Idiot";
        this.studentAge = 21;
    }

    // parameter constructor
    public Student(int sID, String sName, int sAge) {
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

public class constructors {
    public static void main(String[] args) {

        // default constructors
        Student student = new Student();
        student.displayDetails();

        // perameter constructor
        Student student1 = new Student(1, "sam", 21);
        student1.displayDetails();
    }

}
