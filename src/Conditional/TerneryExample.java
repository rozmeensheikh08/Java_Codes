package Conditional;

import java.util.Scanner;

public class TerneryExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter age : ");
        int age = sc.nextInt();

        System.out.println(" Are you Indian citizen? true/false ");
        boolean citizen = sc.nextBoolean();
        String result = ((age>=18)&&(citizen)) ? " You can vote " : " You can't vote " ;

        System.out.println(result);

        sc.close();
    }
}
