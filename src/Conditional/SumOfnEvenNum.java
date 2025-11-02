package Conditional;

import java.util.Scanner;

public class SumOfnEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n for Sum of Even numbers : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i<=num ; i++){
            if(i%2 == 0){
                sum = sum + i;
                if (i<num) {
                    System.out.print(i + " + ");
                }else{
                    System.out.print(i);
                }
            }

        }
        System.out.println(" = " + sum);
        sc.close();
    }
}
