import java.util.*;
public class BiggestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array elemnt");
        int array = scanner.nextInt();
        int[] arr = new int[array];
        System.out.println("enter the array ");
        for (int i =0;i<arr.length;i++) {
            arr[i] = scanner.nextInt();
        }
        int biggest = arr[0];
        for (int element : arr) {
            if (element >biggest) {
                biggest = element;
            }
        }
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double average = (double) sum / array;
        System.out.println("\nEntered elements:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\nBiggest element: " +biggest);
        System.out.println("Sum of elements: " +sum);
        System.out.println("Average of elements: " +average);
        scanner.close();
    }
}
