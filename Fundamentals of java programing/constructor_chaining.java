
class Student {

    int studentID;
    String studentName;
    int studentAge;

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



public class constructor_chaining {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.displayDetails();

    }
    
}
