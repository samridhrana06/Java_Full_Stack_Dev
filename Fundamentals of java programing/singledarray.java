public class singledarray {
    public static void main(String[] args) {
        // int [] marks;
        // marks = new int[5];


        //initializing an array 
        // int[] marks = new int[] {10,20,30,40};

        
        // declare and assign 
        int[] marks = new int[5];
         marks[0] = 100;
         marks[1] = 60;
         marks[2] = 70;
         marks[3] = 80;
         marks[4] = 98;

        //  for(int i=0; i < marks.length;i++){
        //     System.out.println(marks[i]);
        //  }

         for(int value: marks){
            System.out.println(value);
         }





    }
}
