package stringManipulation.removeAllDuplicates;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class removeAllDuplicates {
    // Complete the alternatingCharacters function below.
    public static String removeDuplicates(String s) {
        //This function gets rid off two adjacent same characters
        //So AAAB -> AB
        //So AAABB -> A
        StringBuilder updatedString = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length || i == array.length - 1) {

                if (i == array.length - 1) {
                    updatedString.append(array[i]);
                } else if (array[i] == array[i + 1]) {

                    i = i + 1;
                } else {
                    updatedString.append(array[i]);
                }
            }

        }
        //USe a linked list -> store all unique ones  into list
        //whilst putting into a new string

        return updatedString.toString();
    }

    public static String removeDuplicatesTwo(String S) {
        //USe a linked list -> store all unique ones  into list
        //whilst putting into a new string
        ArrayList<String> letters = new ArrayList<>();
        StringBuilder remainingString = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!letters.contains(S.substring(i, i + 1))) {
                letters.add(S.substring(i, i + 1));
                remainingString.append(S.charAt(i));
            }
        }
        return remainingString.toString();
    }

    public static String removeDuplicatesThree(String S) {
        //This function Removes all duplicates of any character
        //soo aaabbbcc -> abc;
        //USe a linked list -> store all unique ones  into list
        //whilst putting into a new string
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if(!output.toString().contains(S.substring(i, i+1))){
                output.append(S.charAt(i));
            }
        }
        return output.toString();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){
            String input = scanner.next();
            System.out.println(removeDuplicates(input));
            t--;
        }

//        if(args.length > 1){
//            for (int i = 1; i < t; i++) {
//                System.out.print("\n "+ removeDuplicates(args[i]));
////                System.out.println(removeDuplicates(args[i]));
//            }
//        }
    }
}
