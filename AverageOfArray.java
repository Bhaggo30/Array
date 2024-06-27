

public class AverageOfArray {

    public static void main(String[] args) {

        int[] number = {3,5,7,8,2,1};
        int sum =0;
        for (int i =0 ; i< number.length; i++){
            sum += number[i];
        }
        System.out.println("sum of the total array elemnt "+sum);

        double average = sum/number.length;
        System.out.println("average of the array elemnt "+average);
    }
}
