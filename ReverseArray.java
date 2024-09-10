import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array element :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("after reverse the element in array is :-");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //  System.out.println(Arrays.toString(arr));
    }
}
