package stringManipulation.alternatingCharacters;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class alternatingCharacters {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int totalDeletions = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i + 1 < s.length()){
                if (s.charAt(i) == s.charAt(i + 1)) {
                    totalDeletions++;
                }
            }
        }
        return totalDeletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
