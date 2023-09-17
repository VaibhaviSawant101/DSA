package Sort;

public class selection_sort {
    public static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            int sm = i;
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[sm])
                {
                    sm = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[sm];
            arr[sm] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2};
        arr = selectionSort(arr);
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}
