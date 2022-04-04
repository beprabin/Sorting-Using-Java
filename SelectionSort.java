import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray after sorting:");
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
        
    }
}