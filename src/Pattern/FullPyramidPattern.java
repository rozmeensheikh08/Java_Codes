package Pattern;

public class FullPyramidPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){

            for (int j = 1; j <=9; j++){
                if ((j==6-i) || (j==i+4) || ((i!=1 && j==8-i)) || (i!=1 && j==i+2) || (i==5 && j==5) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
