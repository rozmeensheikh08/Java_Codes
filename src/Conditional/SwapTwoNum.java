package Conditional;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        int a = sc.nextInt();
        System.out.print(" Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println(" originally : a = " + a + "," + " b = " + b );

        int t = a;
        a = b ;
        b = t ;


        System.out.println(" After Swap : a = " + a + "," + " b = " + b );



        sc.close();
    }
}
