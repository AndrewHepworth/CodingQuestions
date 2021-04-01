package arrayProblems.countTriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Correct, But not Optimized enough:
//Link to Problem :
// https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1#

public class countTriplets {
    public static int countTriplet(int arr[], int n) {
        // code here
        ArrayList<Integer> pairSums = new ArrayList<>();
        int triplets = 0;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // int binResult = -1;
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i + 1 ; i < n ; j++){
        //         try{
        //             binResult = Arrays.binarySearch(arr, arr[i] + arr[j]) ;
        //         if(binResult >= 0){
        //             triplets++;
        //         }
        //         }catch(Exception e){
        //             System.out.println("i : "+ i + ",j : "+ j + ",k =  " + ", binS = ");
        //         }
        //     }
        // }




        //-----------OLD VERSION -------------------------
        ArrayList<Integer> arrList = new ArrayList<>();
        for(Integer ele : arr){
            arrList.add(ele);
        }
        int currentSum = 0;
        // System.out.println(arrList.toString());
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                //   pairSums.add(arr[i] + arr[j]);
                //   if(arrList.contains(arr[i] + arr[j])){
                //       triplets++;
                //   }
                currentSum = arr[i] + arr[j];
                pairSums.add(currentSum);
            }
        }
        // int triplets = 0;
        // // System.out.println(pairSums.toString());
        // // System.out.println(Arrays.toString(arr));
        // for(Integer ele : arr){
        //     if(pairSums.contains(ele)){
        //         pairSums.remove(ele);
        //         triplets++;
        //     }
        // }
//        for(int i = 0; i < n ; i++){
//            if(pairSums.contains(arr[i])){
//                System.out.println(arr[i]);
//                ++triplets;
//            }
//        }
        for(Integer ele : pairSums){
            if(arrList.contains(ele)){
                ++triplets;
            }
        }

        return triplets;
    }
}
