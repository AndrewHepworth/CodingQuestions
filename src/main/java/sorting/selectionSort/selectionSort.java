package sorting.selectionSort;

public class selectionSort {
    int select(int arr[], int i)
    {
        // code here such that selecionSort() sorts arr[]
        for(int k = 0 ; k < arr.length ; k++){
            selectionSort(arr, k);

        }
        return 0;
    }


    void selectionSort(int arr[], int n)
    {
        int i, j;
        for (i = n-1; i >=0; i--)
        {
//            int j = select(arr, i);
//            swap(&arr[i], &arr[j]);
        }
    }
}
