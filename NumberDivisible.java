import java.util.Scanner;

public class NumberDivisible {
    public static void countDivisible(int [] array){
        int countDivBy4 =0;
        int countDivBy3 =0;
        int countDivBy5 =0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] %4 ==0){
                System.out.println(array[i]+ " ");
                countDivBy4++;
            }
            System.out.println();

            if (array[i] % 3 ==0){
                System.out.println(array[i]+ " ");
                countDivBy3++;
            }
            System.out.println();
            if (array[i] % 5 ==0){
                System.out.println(array[i]+ " ");
                countDivBy5++;
            }
            System.out.println();
        }
        System.out.println("number divisible by 4: "+countDivBy4);
        System.out.println("number divisible by 3 :"+countDivBy3);
        System.out.println("number divisible by 5 :"+countDivBy5);

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
        countDivisible(array);
        scanner.close();;
    }
}
