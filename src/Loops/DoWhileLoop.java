package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter number : ");
        int num = sc.nextInt();

        int i = 1;
        do {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        } while ( i <= 10);
    }
}
