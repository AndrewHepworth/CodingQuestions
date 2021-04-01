package hashmaps.ransomNote;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ransomNote {
    // Complete the checkMagazine function below.
    public static String checkMagazine(String[] magazine, String[] note) {
        HashMap<Integer, String> cutOutWords = new HashMap<>();
        int total = 0;
        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < magazine.length; j++) {
                if(magazine[j].equals(note[i]) && !cutOutWords.containsKey(j)){
                    cutOutWords.put(j, magazine[j]);
                }
            }
        }
        HashMap<String, Integer> magazineWordFrequency = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if(!magazineWordFrequency.containsKey(magazine[i])){
                magazineWordFrequency.put(magazine[i], 1);
            } else if( magazineWordFrequency.containsKey(magazine[i])){
                magazineWordFrequency.replace(magazine[i],
                        magazineWordFrequency.get(magazine[i]) + 1);
            }
        }
//        System.out.println(magazineWordFrequency.toString());
        HashMap<String, Integer> noteWordFrequency = new HashMap<>();
        for (int i = 0; i < note.length; i++) {
            if(!noteWordFrequency.containsKey(note[i])){
                noteWordFrequency.put(note[i], 1);
            } else if (noteWordFrequency.containsKey(note[i])){
                noteWordFrequency.replace(note[i],
                        noteWordFrequency.get(note[i]) + 1);
            }
        }
//        System.out.println(noteWordFrequency.toString());

//        for( Map.Entry<String, Integer> notes : noteWordFrequency.entrySet() ){
//            for( Map.Entry<String, Integer> magazineWords : magazineWordFrequency.entrySet()){
//                if(notes.getValue() <= magazineWords.getValue() &&
//                notes.getKey().equals(magazineWords.getKey())){
//                    total++;
//                }
//            }
//        }

        if(total == note.length){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
//        System.out.println(cutOutWords.toString());
//        if(cutOutWords.size() == note.length){
//            System.out.println("Yes");
//            return "Yes";
//        } else {
//            System.out.println("No");
//            return "No";
//        }
        return "yes";
    }

    public static String checkMagazineTwo(String[] magazine, String[] note) {
        HashMap<Integer, String> magazineWordFrequency = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            magazineWordFrequency.put(i, magazine[i]);
        }
//        System.out.println(magazineWordFrequency.toString());
        HashMap<Integer, String> noteWordFrequency = new HashMap<>();
        for (int i = 0; i < note.length; i++) {
            noteWordFrequency.put(i, note[i]);
        }
//        System.out.println(noteWordFrequency.toString());
        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < magazine.length; j++) {
                if(magazineWordFrequency.containsKey(j) &&
                noteWordFrequency.containsKey(i)){
                    if(magazine[j].equals(note[i])){
                        noteWordFrequency.remove(i);
                        magazineWordFrequency.remove(j);
                    }
                }
            }
        }
//        HashMap<String, Integer> noteWord = new HashMap<>();
//        for (int i = 0; i < note.length; i++) {
//            noteWord.put(note[i], i);
//        }
//        for (int i = 0; i < magazine.length; i++) {
//            if(noteWordFrequency.containsValue(magazine[i])){
//                noteWordFrequency.
//            }
//        }
//        System.out.println(noteWordFrequency.toString());
        if(noteWordFrequency.size() == 0){
            System.out.println("Yes");
            return "Yes";
        } else {
            System.out.println("No");
            return "No";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
