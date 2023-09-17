package Sort;

public class bubble_sort {
    public static int[] bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        arr = bubbleSort(arr);
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}
