package Sort;

public class quick_sort {
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swap
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot =partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}
