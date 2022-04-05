import java.util.Scanner;
public class InsertionSort {
    void sort(int a[],int n){
        int i,j,temp;
        for(i=1;i<n;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && temp<=a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
    }
    void display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        InsertionSort ins_sort =new InsertionSort();
        System.out.println("Array before sorting:");
        ins_sort.display(a, n);
        ins_sort.sort(a, n);
        System.out.println("\nArray after sorting:");
        ins_sort.display(a, n);
        System.out.println();
    }
}
