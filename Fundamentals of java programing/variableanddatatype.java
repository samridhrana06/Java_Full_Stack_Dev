import java.util.Date;
// import java.sql.Date;

// import java.util.Date;;

public class variableanddatatype {

    public static void main(String[] args) {
        byte age = 23;
        long viewscount = 1_23_45_678;
        float price = 234.45F;
        char gender = 'M';
        boolean isValid = true;

        System.out.println(age);
        System.out.println(viewscount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);


        // non premative
        String name = "Samridh rana";
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);

     }
}