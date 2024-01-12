
class Student {

    int studentID;
    String studentName;
    int studentAge;

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

public class constructor_overloading {
    public static void main(String[] args) {
    
        
        Student student = new Student();
        student.displayDetails();

        Student student1 = new Student(101,"sam",21);
        student1.displayDetails();

        Student student2 = new Student(102,"shriya",24);
        student2.displayDetails();

    }
    
}
