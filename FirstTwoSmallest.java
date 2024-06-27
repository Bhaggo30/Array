import java.util.Scanner;

public class FirstTwoSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elemnt");
        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int first_Smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int check : arr){
            if (check < first_Smallest){
                second_smallest = first_Smallest;
                first_Smallest = check;
            } else if (check <second_smallest && check != first_Smallest) {
                second_smallest = check;

            }
        }
        System.out.println("first smallest element in the array is "+first_Smallest);
        System.out.println("second smallest element in the array is "+second_smallest);

    }
}
