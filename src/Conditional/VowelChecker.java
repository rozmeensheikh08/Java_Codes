package Conditional;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter character in Capital : ");
        char check = sc.next().charAt(0);
        if ((check == 'A')||(check== 'E')||(check== 'I')||(check== 'O')||(check== 'U')){
            System.out.println(" Vowel ");
        }else{
            System.out.println(" consonant ");
        }

        sc.close();
    }
}
