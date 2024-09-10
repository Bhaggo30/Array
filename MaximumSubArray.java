public class MaximumSubArray {

        public static int maximumSubArray(int [] num){
            int maxSum = num[0];
            int currentSum = num[0];
            for (int i =1; i<num.length; i++){
                currentSum = Math.max(num[i],currentSum + num[i]);
                maxSum = Math.max(maxSum,currentSum);

            }
            return maxSum;
        }

        public static void main(String[] args) {
            int [] num ={-2,1,-3,-1,2,1,-5,4};
            int result = maximumSubArray(num);
            System.out.println("maximum subArray of array is : "+result);
        }
    }


