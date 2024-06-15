import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        int[] arr = new int[] { 16, 2022, 2001, 1997, 7 };
        int temp = 0;
        System.out.println("Elements of original array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order is here: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            Arrays.sort(arr);
        }
    }
    }

