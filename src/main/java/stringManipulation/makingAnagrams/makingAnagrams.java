package stringManipulation.makingAnagrams;
import java.io.*;
import java.util.*;


public class makingAnagrams {
    // Complete the makeAnagram function below.
    public static int makeAnagram(String a, String b) {
        //want to store the indexes of each string that are
        //the same -> has to be one to one
        StringBuilder a2 = new StringBuilder();
        StringBuilder b2 = new StringBuilder();
        a2.append(a);
        b2.append(b);
        int toRemove = -1;
        HashMap<Integer, Integer> indexes = new HashMap<>();
        for (int j = 0; j < a.length(); j++) {
            for (int k = 0; k < b.length(); k++) {
                if( a.charAt(j) == b.charAt(k)){
                    if(!indexes.containsValue(k)){
                        indexes.put(j, k);
                    }
                }
            }
        }
        int totalLength = (a.length() - indexes.size())
                + (b.length() - indexes.size());
        return totalLength;
    }


    public static int makeAnagramTwo(String a, String b) {
        //want to store the indexes of each string that are
        //the same -> has to be one to one
        int toRemove = -1;
        int totalDeletions = 0;

        HashMap<Integer, Character> stringA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            stringA.put(i, a.charAt(i));
        }
        HashMap<Integer, Character> stringB = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            if(stringA.containsValue(b.charAt(i))) {
                stringB.put(i, b.charAt(i));
            }
        }

        return (a.length() - stringB.size()) +
                (b.length() - stringB.size());
    }

    public static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> aWordFreq = new HashMap<>();
        HashMap<Character, Integer> bWordFreq = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!aWordFreq.containsKey(a.charAt(i))) {
                aWordFreq.put(a.charAt(i), 1);
            } else if (aWordFreq.containsKey(a.charAt(i))) {
                aWordFreq.replace(a.charAt(i),
                        aWordFreq.get(a.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (!bWordFreq.containsKey(b.charAt(i))) {
                bWordFreq.put(b.charAt(i), 1);
            } else if (bWordFreq.containsKey(b.charAt(i))) {
                bWordFreq.replace(b.charAt(i),
                        bWordFreq.get(b.charAt(i)) + 1);
            }
        }
        return bWordFreq.equals(aWordFreq);
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
