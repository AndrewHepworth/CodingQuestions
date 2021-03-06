package generalProblems.salesByMatch;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        //n is the total amount of socks
        //ar is the sock its self which numbers reps the colour.
        int currentColour;
        Set<Integer> colours = new HashSet<>();
        int pairs=0;
       for(int i = 0; i < n ; i++){
           if (!colours.contains(ar[i])) {
               colours.add(ar[i]);
           } else {
               pairs++;
               colours.remove(ar[i]);
           }
       }

        return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

