import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array:");
        num = sc.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("List before bubble sorting:");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }

        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nList after bubble sorting:");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}