package Strings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append(" Rozmeen")); // append add words or a character
        System.out.println(sb.insert(13, " Sheikh"));//insert a word at given index
        System.out.println(sb.length());//show length of String
        System.out.println(sb.capacity());// show storage or capacity of string
        System.out.println(sb.substring(6, 9)); // give a part of string from given start index to given end index
        System.out.println(sb.charAt(6));
        System.out.println(sb.delete(13, 20));
        System.out.println(sb.replace(6, 13 , "Alshifa"));
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        sb.setCharAt(5, 'm');
        System.out.println(sb);
    }
}
