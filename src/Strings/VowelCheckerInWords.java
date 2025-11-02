package Strings;

import java.util.Scanner;

public class VowelCheckerInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Word : ");
        StringBuilder word = new StringBuilder(sc.nextLine());
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')
            ) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

