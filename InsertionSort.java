import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        System.out.println("Array before sorting: ");
        print(a);
        long start = System.nanoTime();
        insertion(a);
        long end = System.nanoTime();
        long execution = end - start;
        double seconds = (double) execution/ 1000000000.0;
        System.out.println("Array after sorting: ");
        print(a);
        System.out.println("Execution time: " + seconds + " seconds");

    }
    static void print(int[] a){
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
    public static void insertion(int[] a){
        int x, y;
        for (int i = 1; i<a.length; i++){
            y = a[i];
            x = i;
            while (x>0 && a[x-1]>y){
                a[x] = a[x-1];
                x = x-1;
            }
            a[x] = y;
        }
    }
}
