package Sort;

public class merge_sort {
    public static void conquer(int[] arr, int st, int mid, int end)
    {
        int[] merged = new int[end-st+1];

        int idx1 = st;
        int idx2 = mid+1;
        int i = 0;
        while(idx1 <= mid && idx2 <= end)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[i++] = arr[idx1++];
            }
            else
            {
                merged[i++] = arr[idx2++];
            }
        }

        while(idx1 <= mid)
        {
            merged[i++] = arr[idx1++];
        }

        while(idx2 <= end)
        {
            merged[i++] = arr[idx2++];
        }

        for(int a = 0, b = st; a < merged.length; a++, b++)
        {
            arr[b] = merged[a];
        }
    }
    public static void divide(int[] arr, int st, int end)
    {
        if(st >= end)
        {
            return;
        }
        int mid = st + (end-st)/2;
        divide(arr,st, mid);
        divide(arr, mid+1, end);
        conquer(arr, st, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}
