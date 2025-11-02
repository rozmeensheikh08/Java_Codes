package Conditional;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter your AGE : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.print(" you have licence ? true/false : ");
            boolean licence = sc.nextBoolean();
            if (licence){
                System.out.print(" you have helmet ? true/false : ");
                boolean helmet = sc.nextBoolean();
                if (helmet){
                    System.out.println(" You Can Drive and you can fill petrol  ");
                }else {
                    System.out.println(" You Can Drive but you can't fill petrol  ");
                }
            }else {
                System.out.println(" you can't drive! ");
            }
        } else {
            System.out.println(" you are under age to drive ! ");
        }



        sc.close();
    }
}
