import java.util.*;
public class RadixSort {
    void sort(int a[], int mode, int x) {
        int digits = 3;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] % mode > a[j] % mode) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if (x != digits) {
            sort(a, mode * 10, x + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        RadixSort obj = new RadixSort();

        System.out.println("Array before Sort:");
        System.out.println(Arrays.toString(a));

        obj.sort(a, 10, 0);

        System.out.println("\nArray after Sort:");
        System.out.println(Arrays.toString(a));
    }
}
