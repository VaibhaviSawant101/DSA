package Sort;

public class Insertion_Sort {
    public static int[] insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2};
        arr = insertionSort(arr);
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}
