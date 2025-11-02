package Conditional;

import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int n = sc.nextInt();

        if(n>0){
            System.out.print(" Positive ");
        } else if (n<0) {
            System.out.println(" Negative ");

        }else {
            System.out.println(" Number is 0 ");
        }


        sc.close();
    }
}
