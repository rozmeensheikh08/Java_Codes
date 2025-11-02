package Conditional;

import java.util.Scanner;

public class EvenOddCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = sc.nextInt();

        if ( num%2==0) {
            System.out.println(" Even number ");
        } else {
            System.out.println(" odd number ");
        }

        sc.close();
    }
}
