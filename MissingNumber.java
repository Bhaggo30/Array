public class MissingNumber {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,6,7,8,9,10};
        int sum1 =0;
        for(int i =0; i<array.length; i++){
            sum1 += array[i];
        }
        System.out.println("sum of an array is "+sum1);
        int sum2 =0;
        for(int j =1; j<=10; j++){
            sum2 += j;
        }
        System.out.println("sum of the index is "+sum2);
        System.out.println("missing number is "+(sum2-sum1));
    }


}
