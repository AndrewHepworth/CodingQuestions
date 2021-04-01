package sorting.insertionSort;

public class insertionSort {
    static void insert(int arr[], int i){
        //This is the correct version.
        //THe key is where we are looking each iter in for loop
        //the i looks at each element to swap with the key each iter.
        int key = 0;
        for(int j = 1; j < arr.length ; j++){
            key = arr[j];
            i = j - 1;
            while(i >= 0 && arr[i] > key){
                //Keep shuffling
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
}
