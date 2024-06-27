import java.util.Scanner;

public class FirstTwoBiggestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("enter the array element");
        for (int i =0; i<array.length; i++){
            array[i] = scanner.nextInt();

        }
      int firstBiggest =Integer.MIN_VALUE;
      int secondBiggest =Integer.MIN_VALUE;
        for (int element : array) {
            if (element > firstBiggest) {
                secondBiggest = firstBiggest;
                firstBiggest = element;
            } else if (element > secondBiggest && element!= firstBiggest) {
                secondBiggest = element;
            }
        }
          System.out.println("first biggest elemnt "+firstBiggest);
          System.out.println("second biggest elemnt "+ secondBiggest);


      }
      }



