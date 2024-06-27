import java.util.Scanner;

public class Secondlargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("enter the array element");
        for (int i =0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        int firstLargest = array[0];
        for (int i =0; i<array.length; i++){
            if (firstLargest<array[i]){
                firstLargest = array[i];
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        for(int i =0; i<array.length;i++){
            if (array[i]>secondlargest && array[i]< firstLargest){
                secondlargest  = array[i];
            }
        }
        System.out.println();
        System.out.println(" second largest element is : "+secondlargest);

    }
}
