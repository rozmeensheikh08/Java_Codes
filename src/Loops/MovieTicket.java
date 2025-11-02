package Loops;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Age : ");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println(" Free ");

        } else {
            if ((age >= 5) && (age <= 12)) {
                System.out.println(" 150 rupees ");
            } else {
                if ((age >= 13) && (age <= 59)) {
                    System.out.println(" 250 rupees ");
                } else {
                    System.out.println(" 250 rupee ");
                }


                sc.close();


            }
        }
    }
}
