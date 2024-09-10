import java.util.Scanner;

public class DigitCount {
    public static int digitCount(int [] array){
         int totaldigit =0;
        for (int i =0; i< array.length;i++){
            String number =Integer.toString(array[i]);
            totaldigit += number.length();
        }
        return totaldigit;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("enter the array element "+n);
        for (int i =0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }
        int count = digitCount(array);
        System.out.println("total number of count :"+count);

    }
}
