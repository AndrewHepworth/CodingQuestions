package stringManipulation.validString;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class validString {
    // Complete the isValid function below.
    public static String isValid(String s) {
        HashMap<Character, Integer > charFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!charFreq.containsKey(s.charAt(i))){
                charFreq.put(s.charAt(i), 1);
            } else {
                charFreq.replace(s.charAt(i),
                        charFreq.get(s.charAt(i)) + 1);
            }
        }



        HashMap<Integer, Integer> groupByNumber = new HashMap<>();

        for(Map.Entry<Character, Integer> characterFreq : charFreq.entrySet()){
            if (!groupByNumber.containsKey(characterFreq.getValue())) {

                groupByNumber.put(characterFreq.getValue(), 1);

            } else {
                groupByNumber.replace(characterFreq.getValue(),
                        groupByNumber.get(characterFreq.getValue()) + 1);
            }
        }
        int toChange = 0;
        System.out.println("Grouped by Character: " + charFreq.toString());
        System.out.println("Grouped by Number Of: " + groupByNumber.toString());
//        for(Map.Entry<Integer,Integer> numberTotals : groupByNumber.entrySet()){
//            if(numberTotals.getValue() > 1){
//                System.out.println("here");
//                toChange++;
//            }
//        }
        //use the equation (abs(difference of two adjacent keys) x value)
        //If this value is greater than 1 at any point or the total is greater than one, it will not
        //Be a valid number
//        for (Map.Entry<Integer, Integer> compareOne : groupByNumber.entrySet()){
//            for(Map.Entry<Integer, Integer> compareTwo : groupByNumber.entrySet()){
//                toChange += Math.abs(compareOne.)
//            }
//
//        }


//        for (int i = 0; i < groupByNumber.size(); i++) {
//            if (i + 1 < groupByNumber.size()) {
//                toChange = Math.abs(groupByNumber. - groupByNumber.get(i+1))  *
//            }
//        }
        if(toChange < 2 ) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

//        for (int i = 0; i < charFreq.size(); i++) {
//            //check if the key isnt already in the hashmap
//            //How?
//            if(groupByNumber.containsValue(charFreq.values())){
//                groupByNumber.put()
//                charFreq.put(s.charAt(i), 1);
//            } else {
//                charFreq.replace(s.charAt(i),
//                        charFreq.get(s.charAt(i)) + 1);
//            }
//        }
//        //now we want to know how many characters to remove
//        //to make them equal.
//        //Find unique number -> then count them
//        int currentValue = -1;
//        int theorecticalValue = 0;
//        int actualCount = 0;
//        for(Map.Entry<Character, Integer> letterCounter : charFreq.entrySet()){
//            if(currentValue < 0){
//                currentValue = letterCounter.getValue();
//                theorecticalValue = currentValue * charFreq.size();
//            }
//            actualCount += letterCounter.getValue();
//        }
//        if(theorecticalValue-1 == actualCount || theorecticalValue == actualCount ){
//            return "YES";
//        } else {
//            return "NO";
//        }
//
//        //Add value to  a new hashmap and delete/remove from old
//        //each iteration

