/**
 * Innerinheritance
 */
class person {

    String name;

    public person() {
        System.out.println("Person Class Constructor Invoked. ");
        name = "King kochar";

    }

}



class Employee extends person {
    String designation;

    public Employee() {
        System.out.println("Employee Class Constructor Invoked. ");

        designation = "Manager";
    }
}

public class inheritance {
    public static void main(String[] args) {

        Employee employee = new Employee();
    }

}
