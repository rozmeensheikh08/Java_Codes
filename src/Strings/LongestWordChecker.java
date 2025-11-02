package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence or some words : ");
        String sen = sc.nextLine();
        String[] newSen = sen.split(" ");
//        System.out.println(newSen.length);
        int[] nums = new int[newSen.length];
       for (int i = 0 ; i < newSen.length; i++){
          nums[i] = newSen[i].length();
       }
        Arrays.sort(nums);
        for (int i = 0 ; i < newSen.length; i++){
            if (newSen[i].length() == nums[newSen.length-1]){
                System.out.println(" Longest word = " + newSen[i]);
            }

        }

    }
}
