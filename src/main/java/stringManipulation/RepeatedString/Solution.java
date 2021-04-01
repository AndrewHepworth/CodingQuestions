package stringManipulation.RepeatedString;
import java.io.*;
import java.util.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long repetitions = Math.floorDiv(n,s.length());
        long remainder = n % s.length();
        String reducedInput = s.substring(0, (int) remainder );
        long numberOfA = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == 'a'){
                numberOfA++;
            }
        }
        numberOfA = numberOfA *  repetitions;
        for(int i = 0 ; i < reducedInput.length() ; i++){
            if(reducedInput.charAt(i) == 'a'){
                numberOfA++;
            }
        }
        return numberOfA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
