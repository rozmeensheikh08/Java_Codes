package Strings;

import java.util.Scanner;

public class SpiltName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        String[] newName = name.split(" ");
        for (String s : newName){
            System.out.println(s);
        }

        sc.close();
    }
}
