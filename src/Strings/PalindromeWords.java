package Strings;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Word : ");
        StringBuilder  word = new StringBuilder(sc.nextLine());

        String rev = word.toString();

        if(rev.equals(word.reverse().toString())){
            //System.out.println(word.reverse());
            System.out.println(" Palindrome word ");
        }else{
            System.out.println(" Not a Palindrome word ");
        }
        sc.close();
    }
}
