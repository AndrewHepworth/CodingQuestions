package stringManipulation.FrequencyWords;

import java.util.*;

public class frequencyWords {
    public static String mostFrequentWord(String arr[],int n)
    {
        LinkedHashMap<String, Integer> groupByFrequency = new LinkedHashMap<>();
        int newTotal = 0;
        for (int i = 0; i < n ; i++) {

            if(!groupByFrequency.containsKey(arr[i])){
                groupByFrequency.put(arr[i], 1);
            } else if(groupByFrequency.containsKey(arr[i])){
                newTotal = groupByFrequency.get(arr[i]) + 1;
//                groupByFrequency.remove(arr[i]);
                groupByFrequency.put(arr[i], newTotal);
            }
        }

//        System.out.println(groupByFrequency.toString());
        String mostFrequentWord = "";
        int highestFrequency = 0;
        for( Map.Entry<String, Integer> totals : groupByFrequency.entrySet()){
            if(totals.getValue() >= highestFrequency){
                mostFrequentWord = totals.getKey();
                highestFrequency = totals.getValue();
            }
        }
//        System.out.println(mostFrequentWord);
        return mostFrequentWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String[] arr = sc.next().split(" ");
            System.out.println(mostFrequentWord(arr, n));
        }
    }
}
class trie_element {
    public trie_element[] nxt;
    public int count;
    public int first_appearance;

    public trie_element() {
        count = 0;
        nxt = new trie_element[26];
        for (int i = 0; i < 26; i++) {
            nxt[i] = null;
        }
    }
}
