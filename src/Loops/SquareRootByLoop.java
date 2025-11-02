package Loops;

import java.util.Scanner;

public class SquareRootByLoop {


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = sc.nextInt();
        for (double i = 0; i<=num; i++){
            if (i*i == num ){
                System.out.println(" SquareRoot = " + i);
            break;
            }

        }

        sc.close();
    }
}
