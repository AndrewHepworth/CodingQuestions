package stringManipulation.longestDistinctCharacters;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class longestDistinctCharacters {
    //Seperate into
    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        String wrong = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        int testSize = scanner.nextInt();
        String test = "";
        while(testSize > 0 && testSize <= 100){
            test = scanner.next();
            if(test.length() >= 1 && test.length() <= 10000) {
                System.out.println(longestString(test));
            }
            testSize--;
        }
        scanner.close();
    }

    private static int longestString(String test) {
        ArrayList<Character> uniqueCharacters = new ArrayList<>();
        ArrayList<Character> substringOfTest = new ArrayList<>();
        int lowestSubstring = test.length();
        for (int i = 0; i < test.length(); i++) {
            if(!uniqueCharacters.contains(test.charAt(i))){
                uniqueCharacters.add(test.charAt(i));
            }
        }
//        System.out.println(uniqueCharacters.toString());

        for (int i = 0; i < test.length(); i++) {
            substringOfTest.add(test.charAt(i));
            for (int j = i + 1; j < test.length(); j++) {
                if(!substringOfTest.containsAll(uniqueCharacters)){
                    substringOfTest.add(test.charAt(j));
//                    System.out.print(" +" + substringOfTest.get(substringOfTest.size() - 1));
                } else if( substringOfTest.containsAll(uniqueCharacters)){
//                    System.out.println( "Current i = "+ i +" , Size of Sub Array: " + substringOfTest.size() );
                    if(substringOfTest.size() < lowestSubstring){
                        lowestSubstring = substringOfTest.size();
                    }
                }
            }
            substringOfTest.clear();
        }
    //        uniqueCharacters.containsAll(Arrays.asList(test.toCharArray()));
        return lowestSubstring;
    }
    private static int longestStringTwo(String test) {
        ArrayList<Character> uniqueCharacters = new ArrayList<>();
        ArrayList<Character> substringOfTest = new ArrayList<>();
        int lowestSubstring = test.length();
        for (int i = 0; i < test.length(); i++) {
            if(!uniqueCharacters.contains(test.charAt(i))){
                uniqueCharacters.add(test.charAt(i));
            }
        }
        for (int i = 0; i < test.length(); i++) {
            substringOfTest.add(test.charAt(i));
            for (int j = i + 1; j < test.length(); j++) {
                if(!substringOfTest.containsAll(uniqueCharacters)){
                    if(!substringOfTest.contains(test.charAt(j))){
                        substringOfTest.add(test.charAt(j));
                    }
                }
                if(substringOfTest.containsAll(uniqueCharacters)){
                    if(j - i < lowestSubstring){
                        lowestSubstring = j - i;
                    }
                }
            }
            substringOfTest.clear();
        }
        //        uniqueCharacters.containsAll(Arrays.asList(test.toCharArray()));
        return lowestSubstring;
    }

}
