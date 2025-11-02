package Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number : ");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println(" leap Year ");
        } else {
            System.out.println(" not a Leap Year");
        }
        sc.close();
    }
}
