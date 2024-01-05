public class string_buffer {
    public static void main(String[] args) {
        

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("World");
        System.out.println(buffer);
        System.out.println(buffer.capacity());


        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.capacity());
        builder.append("World");
        System.out.println(builder);


    }
    
}
