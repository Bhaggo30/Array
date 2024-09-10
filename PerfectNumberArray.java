import java.util.Scanner;

public class PerfectNumberArray {
    public static int countperfect(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPerfect(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPerfect(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
            return sum == num;
        }


        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the size of an array");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("enter the array element " + n);
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int perfectNumberCount = countperfect(array);
            System.out.println(perfectNumberCount);
        }
    }
