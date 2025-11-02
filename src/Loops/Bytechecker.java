package Loops;

import java.util.Scanner;

public class Bytechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Num in GB : ");
        long numInGB = sc.nextInt();

        long numInB = numInGB * 1000000000;

        System.out.println(" Number in Byte = " + numInB + " B ");
        sc.close();
    }
}
