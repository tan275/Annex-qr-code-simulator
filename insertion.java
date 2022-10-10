

import java.util.*;

public class  insertion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter number of element:");
        int n = sc.nextInt();
        // System.out.println("Enter numbers:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n-i;
        }
        int comp = 0, sw = 0;
        System.out.println("After Sorting:");
        int i, key, j;
        long start=System.nanoTime();
    for (i = 0; i < n; i++)
    {
        key = a[i];
        j = i - 1;
 
        comp++;
        while (j >= 0 && a[j] > key)
        {
            sw++;
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
    for( i=0;i<n;i++){
    //System.out.println(a[i]);
    }
 
        long end = System.nanoTime();
        long runningTime = (end - start);
        System.out.println("Running time of this algorithm is: " + runningTime + " microseconds & Swaps: " + sw
                + " , comparition: " + comp);
}
    }
