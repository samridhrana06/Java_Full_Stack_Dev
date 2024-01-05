public class strings {
    public static void main(String[] args) {
        //string manipulation 

        //string literal
        String str1 = "Hello";
        System.out.println(str1);
        

        //string object
        String str2 = new String("World");
        System.out.println(str2);


        String str3 = str1+str2;
        System.out.println(str3);

       //legth
       System.out.println(str3.length()); 

       //get specific character
       System.out.println(str3.charAt(0));
       
       //concat string
       System.out.println(str1.concat(str2));

       //get substring 
       System.out.println(str3.substring(0, 5));

       //compare 2 string
       System.out.println(str1.equals(str3));

       //contains the string or not
       System.out.println(str3.contains("World"));

    }
    
}
