package arrayProblems.arrayLeftRotation;
import java.io.*;
import java.util.*;

public class arrayLeftRotation {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int leftShift = d % a.length;
       // int newPosition = currentPosition - leftShift
        int newPosition = 0;
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            //We do the shift, then add the length to get
            //a positive position within the modulo universe.
            newPosition = ((i - leftShift) + a.length) % a.length;
            b[newPosition] = a[i];
        }
        //Simpleton Code
//        int temp = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if(i + 1 < a.length) {
//                a[i] = a[i + 1];
//            }
//        }
//        a[a.length-1] = temp;



        return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
