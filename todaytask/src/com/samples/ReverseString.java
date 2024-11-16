package com.samples;

import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {

    }


    public String stringReverseStreamApi(String rev){

        String reversed = rev.chars()                    // Create an IntStream of character codes (ASCII values)
                .mapToObj(c -> (char) c)  // Convert the int stream to a Stream<Character>
                .collect(Collectors.toCollection(StringBuilder::new)) // Collect into StringBuilder
                .reverse()                // Reverse the StringBuilder
                .toString();

        retrun reversed;
    }
}
