package Pattern;

import java.util.Scanner;

public class DynamicPlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of size : ");
        int size = sc.nextInt();

        for (int i = 1; i <= size ; i++){
            for (int j = 1; j <= size; j++){
                if ((i== (size + 1 )/2)||(j== (size + 1 )/2)) {
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }

            }System.out.println();
        }

    }
}
