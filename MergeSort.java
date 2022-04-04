import java.util.Scanner;
public class MergeSort {
    // Merges two subaays of a[].
    // First subaay is a[l..m]
    // Second subaay is a[m+1..r]
    void merge(int a[], int l, int m, int r) {
        // Find ns of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subaays
        int i = 0, j = 0;
        // Initial index of merged subaay aay
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    // Main function that sorts a[l..r] using
    // merge()
    void sort(int a[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
            // Sort first and second halves
            sort(a, l, m);
            sort(a, m + 1, r);
            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }
    // A utility function to print array of n n 
    static void printarray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting:");
        printarray(a);

        MergeSort ob = new MergeSort();
        ob.sort(a, 0, a.length - 1);

        System.out.println("\nArray after Sorting");
        printarray(a);
    }
}
