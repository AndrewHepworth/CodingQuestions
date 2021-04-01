package stringManipulation.longestPalindrome;


import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {
        String longPalindrome;
//        if(args.length > 1) {
//            int numberOfTests = Integer.parseInt(args[0]);
//            for (int i = 1; i <= numberOfTests; i++) {
//                //Go through all test cases
////                System.out.println("here");
//                longPalindrome = findLongestPalindrome(args[i]);
//                System.out.println(longPalindrome);
//            }
//        }
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        System.out.println(t);
        String next = "";
        while(t > 0){
            System.out.println("here");
            next = sc.next();
           System.out.println(next);
            longPalindrome = findLongestPalindrome(next);
            System.out.println(longPalindrome);
            t--;
        }
        sc.close();
    }

    public static String findLongestPalindrome(String testCase) {
        //As its a palindrome the reverse has to be the same as
        //the normal variant
        String currentHighestPalindrome = "";
        //Selects the first character
        for (int j = 0; j < testCase.length(); j++) {

            //Then goes through the word starting from that character selected
            for (int i = j + 1; i <= testCase.length(); i++) {
                //Palindrome definition : the reverse of the string is the same
                //As the normal string
                if (testCase.substring(j, i).equals(reverse(testCase.substring(j, i)))) {
                    //If a palindrome is found and then the length of that palindrome
                    //Is longer than the current highest palindrome that has been found
                    //So far, update the string with the new palindrome.
                    if (testCase.substring(j, i).length() > currentHighestPalindrome.length()) {
                        currentHighestPalindrome = testCase.substring(j, i);
                    }
                }
            }
        }
        return currentHighestPalindrome;
    }

    static String reverse(String subTestCase) {
        StringBuilder reversed = new StringBuilder();
//        reversed.append(subTestCase).reverse();
        for (int i = 0; i < subTestCase.length(); i++) {
            //Just adds the subTestCase characters in reverse order
            reversed.append(subTestCase.charAt(subTestCase.length() - 1 - i));
        }
        return  reversed.toString();
    }

    //This method is just for finding a palindrom
    static Boolean isPalindrome(String test){
        StringBuilder testReversed = new StringBuilder();
        return testReversed.append(test).reverse().toString().equals(test);
    }
    //Or the manual way
    static Boolean isPalidromeManual(String test) {
        StringBuilder testReversed = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            testReversed.append(test.charAt(test.length() - 1 - i));
        }
        return test.equals(testReversed.toString());
    }
}
