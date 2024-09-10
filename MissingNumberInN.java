

public class MissingNumberInN {



        public static int findMissingNumber(int [] num){
            int n = num.length;
            int sum = (n+1)*(n+2)/2;
            int arraySum = 0;
            for(int i =0; i<num.length; i++){
                arraySum +=num[i];
            }
            return sum - arraySum;
        }

        public static void main(String[] args) {
            int [] number ={1,3,5,7,6,4};
            System.out.println("missing number is "+findMissingNumber(number));
            System.out.println(number.length);
        }
    }


