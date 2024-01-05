public class multidimentional_array {
    public static void main(String[] args) {
        int marks [][] = {
            {67,78,87,98},
            {87,76,33,56},
            {76,90,98,99}
        };

        for(int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(marks[i][j] + "\t" );
            }
            System.out.println();
        }
    }
    
}
