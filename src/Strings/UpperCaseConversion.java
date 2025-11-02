package Strings;

import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence or some words : ");
        String sen = sc.nextLine();
        //String sen = "my name is rozmeen";
        String[] newSen = sen.split(" ");
       // System.out.println(newSen.length);
        StringBuilder upper = new StringBuilder();
        for (int i = 0; i < newSen.length; i++) {
            upper.append(newSen[i].toUpperCase().charAt(0)).append(newSen[i].substring(1)).append(" ");
            }
            System.out.println(upper);
    }
}

