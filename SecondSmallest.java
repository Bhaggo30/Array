import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size elemnt");
        int n = scanner.nextInt();
        int[] array_Small = new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < array_Small.length; i++) {
            array_Small[i] = scanner.nextInt();
        }
        int first_Smallest = array_Small[0];
        for (int i = 0; i < array_Small.length; i++) {
            if (first_Smallest > array_Small[i]) {
                first_Smallest = array_Small[i];
            }
        }
        int second_smallest = Integer.MAX_VALUE;
        for (int i =0; i<array_Small.length; i++){
            if (array_Small[i] != first_Smallest && array_Small[i]< second_smallest){
                second_smallest = array_Small[i];
            }
        }
        System.out.println("second smallest elemnt are :"+second_smallest);
    }
}