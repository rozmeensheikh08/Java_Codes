package Conditional;

import java.util.Scanner;
public class SwitchCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        double firstNum = sc.nextDouble();

        System.out.print(" Enter Second Number : ");
        double secondNum = sc.nextDouble();

        System.out.println("Enter number for " + "\nAddition = 1 " + "\nSubstraction = 2 " + "\nMultiplication  = 3 " + " \nDivision = 4");
        //System.out.print(" Enter number for Addition = 1, Substraction = 2, Multiplication  = 3, Division = 4, : ");

        int calculation = sc.nextInt();

        switch (calculation){
            case 1 : System.out.println(" Addition = " + (firstNum+secondNum));
                break;
            case 2 : System.out.println(" Substraction = " + (firstNum-secondNum));
                break;
            case 3 : System.out.println(" Multiplication  = " + (firstNum*secondNum));
                break;
            case 4 : System.out.println(" Division = " + (firstNum/secondNum));
                break;
            default: System.out.println(" Invalid ! ");
        }



        sc.close();
    }
}
