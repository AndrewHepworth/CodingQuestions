package hashmaps.twoStrings;
import java.io.*;
import java.util.*;

public class twoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Integer, Character> stringOne = new HashMap<>();
        HashMap<Integer, Character> stringTwo = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            stringOne.put(i, s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            stringTwo.put(i, s2.charAt(i));
        }
        for( Map.Entry<Integer, Character> stringEntry : stringOne.entrySet()){
            if(stringTwo.containsValue(stringEntry.getValue())){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
