import java.util.Scanner;

public class ArrayPositiveNegative {
    int countp = 0;
    int countN = 0;
    public void getPostive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countp++;
                System.out.println(arr[i]+ " ");
            }
        }

    }
    public void getNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countN++;
                System.out.println(arr[i]+" " );
            }
        }

    }

    public static void main(String[] args) {
        ArrayPositiveNegative apn = new ArrayPositiveNegative();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        apn.getPostive(arr);
        System.out.println("postive array elemnt :- "+apn.countp+ " ");
        apn.getNegative(arr);
        System.out.println("negative element:- "+apn.countN);
    }
}