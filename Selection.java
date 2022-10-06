import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 0};
        reselect(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxindex, int last) {
        int temp = arr[maxindex];
        arr[maxindex] = arr[last];
        arr[last] = temp;
    }

    static void reselect(int[] arr, int r, int c ,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                reselect(arr,r,c+1,c);
            }else{
                reselect(arr,r,c+1,max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]= temp;
            reselect(arr,r-1,0,0);
        }
    }
}

