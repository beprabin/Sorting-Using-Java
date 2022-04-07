import java.util.*;
public class HeapSort {
    static void heapify(int a[], int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n) {
            if (a[child] > a[max]) {
                max = child;
            }
        }
        if (child + 1 < n) {
            if (a[child + 1] > a[max]) {
                max = child + 1;
            }
        }
        if (max != i) {
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }
    static void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }
    static void heap(int a[]) {
        buildheap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting:");
        System.out.println(Arrays.toString(a));
        heap(a);
        System.out.println("\nArray after Sorting:");
        System.out.println(Arrays.toString(a));
    }

}
