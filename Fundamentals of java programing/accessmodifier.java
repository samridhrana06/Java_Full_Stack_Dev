/**
 * Person
 */

public class Person{

    private String firstName;
    private String lastName;
    

    public String getfirstName(){
    return this.firstName;
    }
    public void setFirstname(String firstName){
     this.firstName = firstName;
    }

    public String getlastname(){
     return this.lastName;
    }
    public void setlastname(String lastName){
     this.lastName = lastName;
    }
     
}


public class accessmodifier {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setFirstname("Sam");
        System.out.println(person.getfirstName());
        person.setlastname("Rana");
        System.out.println(person.getlastname());

    }
    
}
