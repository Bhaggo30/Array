import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array element :-");
        for (int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("after reverse the elemnt in array is :-");
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ,");
        }
    }
}