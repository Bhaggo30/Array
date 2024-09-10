import java.util.Scanner;

public class PallindromeArray {
    public static int countPallindrome(int [] array){
        int count =0;
        for (int i =0; i<array.length; i++){
            if (isPallindrome(array[i])){
                System.out.println("number is pallindrome "+array[i]);
                count++;
            }
            else{
                System.out.println(array[i]+ "number is not pallindrome");
            }
        }
        return count;
    }
    public static boolean isPallindrome(int num){
        int original = num;
        int reverse =0;
        while (num !=0){
            int digit = num %10;
            reverse = reverse *10 +digit;
            num = num /10;

        }
        return original==reverse;
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
        int pallindromecount = countPallindrome(array);
        System.out.println("number of pallindrome in an array is "+pallindromecount);
        System.out.println("number is pallindrome"+isPallindrome(pallindromecount));
    }
}
