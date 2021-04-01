package stringManipulation.PermutationsOfString;

import java.util.ArrayList;

public class permutationsOfString {

    public static void main(String[] args) {

        String[] args2 = {"2", "ABC", "ABSG"};
//        ArrayList<String> permutations = new ArrayList<>();
        StringBuilder currentP = new StringBuilder();

        //Go through the arguments
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {

            //Each argument should go to another method
            //that deals with the String
            String permutations = getPermutations(args[i]);
            char[] array = args[i].toCharArray();
            for (int j = 0; j < array.length; j++) {
                currentP.append(array[i]);
                for (int k = 0; k < array.length; k++) {

                }
            }
            currentP.delete(0, currentP.length());
//            permutations.clear();
        }

    }

    private static String getPermutations(String testCase) {
        //Get the sub string and swap all of them, adding each to string,
        //Then swapping
        //A BC - > A CB -> B AC -> B CA
        String currentPerm = "";
        ArrayList<String> listOfPerm = new ArrayList<>();
        for (int i = 0; i < testCase.length(); i++) {
            for (int j = i+1; j < testCase.length() - i ; j++) {


            }
        }
        return testCase;
    }
}
//class GFG {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t != 0) {
//            String str = sc.nextLine();
//            Set<String> s = new HashSet<String>();
//            s.addAll(pf(str));
//            int n = s.size();
//            String arr[] = new String[n];
//            arr = s.toArray(arr);
//            Arrays.sort(arr);
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            t--;
//        }
//    }

//    static Set<String>pf(String str){
//        Set<String>perm=new HashSet<String>();
//        if(str==null){
//            return null;
//        }
//        if(str.length()==0){
//            perm.add("");
//            return perm;
//        }
//        char initial=str.charAt(0);
//        String rem=str.substring(1);
//        Set<String>words=pf(rem);
//        for(String strnew:words){
//            for(int i=0;i<=strnew.length();i++){
//                perm.add(charinsert(strnew,initial,i));
//            }
//        }
//        return perm;
//    }
//    static String charinsert(String str,char c,int j){
//        String begin=str.substring(0,j);
//        String end=str.substring(j);
//        return begin+c+end;
//    }
//}