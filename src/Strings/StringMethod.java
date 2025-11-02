package Strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = " Rozmeen ";
       String s2 = "ROZMEEN";
       String s3 = "roz";
        System.out.println(s1.length()); //length of string
        System.out.println(s1.charAt(0)); //print index character
        System.out.println(s1.substring(3));//remove character upto perameter
        System.out.println(s1.substring(0,3));//print characters upto range
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));// ignore case AND check equal or not equal
        System.out.println(s2.length());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.trim());//remove space
        System.out.println(s2.startsWith("ROZ"));
        System.out.println(s1.endsWith("een "));
        System.out.println(s1.contains("m"));//checks character is in string or not
        String s4 = s1.replace("Rozmeen", "Alshifa");//replace words
        System.out.println(s1.equals(s4));
        String s5 = " Rozmeen , Alshifa , Roz";
        String[] s6 = s5.split(",");
        for (String s : s6){
            System.out.println(s);
        }

        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("e"));
        System.out.println(s1.isEmpty());
        int num = 100;
        String str = String.valueOf(num);//convert integer into String
        System.out.println(str+50); //10050


    }
}
