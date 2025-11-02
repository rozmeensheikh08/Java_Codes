package Conditional;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks in hindi out of 50 : ");
        double hindi = sc.nextDouble();

        System.out.print("Enter Your Marks in maths out of 100 : ");
        double maths = sc.nextDouble();

        System.out.print("Enter Your Marks in physics out of 100 : ");
        double physics = sc.nextDouble();

        System.out.print("Enter Your Marks in chemistry out of 100 : ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Your Marks in english out of 50 : ");
        double english = sc.nextDouble();

        double marks = hindi + english + chemistry + maths + physics;
        double percent = (marks*100)/400;

        System.out.println(" ");
        System.out.println(" Your Total marks out of 400 = " + marks);
        System.out.println(" Your percentage = " + percent + "%");

        if ((percent >= 95) && ( percent <= 100)) {
            System.out.println(" Your Grade = A++");
        } else if ((percent >= 90) && (percent <= 95)) {
            System.out.println(" Your Grade = A+");
        } else if ((percent >= 80) && (percent <= 90)) {
            System.out.println(" Your Grade = A");
        } else if ((percent >= 65) && (percent <= 80)) {
            System.out.println(" Your Grade = B");
        } else if ((percent >= 50) && (percent <= 65)) {
            System.out.println(" Your Grade = C");
        } else if ((percent >= 33) && (percent <= 50)) {
            System.out.println(" Your Grade = D");
        } else if ((percent >= 0) && (percent < 33)) {
            System.out.println(" Fail! ");
        } else {
            System.out.println(" Wrong marks ! ");
        }




        sc.close();
    }
}
