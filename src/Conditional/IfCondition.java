package Conditional;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter time : ");
        double time = sc.nextInt();

        if (time >= 2) {
            System.out.println(" You can go home ");
        } else {
            System.out.println(" You can't go home ");
        }

        sc.close();
    }
}
