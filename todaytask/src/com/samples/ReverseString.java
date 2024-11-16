package com.samples;

import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(ReverseString.stringReverseStreamApi("He"));
        System.out.println(ReverseString.reverseString("eH"));
    }


    public static String reverseString(String str){
        String reversed = "";

        // Loop through the original string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String stringReverseStreamApi(String rev){

        String reversed = rev.chars()                               // IntStream of character codes (ASCII values)
                .mapToObj(c -> (char) c)                              // Convert the int stream to a Stream<Character>
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) // Collect into StringBuilder
                .reverse()                                           // Reverse the StringBuilder
                .toString();                                         // Convert StringBuilder to string

        return reversed;
    }
}
