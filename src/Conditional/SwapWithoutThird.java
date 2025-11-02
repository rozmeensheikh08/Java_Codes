package Conditional;

import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        int a = sc.nextInt();
        System.out.print(" Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println(" originally : a = " + a + "," + " b = " + b );

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println(" originally : a = " + a + "," + " b = " + b );



        sc.close();
    }
}
