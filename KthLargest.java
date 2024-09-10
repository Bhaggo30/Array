import java.util.Arrays;

public class KthLargest {
        public static int findKthLargest(int[] num ,int k){
            Arrays.sort(num);
            return num[num.length-k];

        }

        public static void main(String[] args) {
            int []largest ={1,3,5,7,9,2};
            int k =2;
            int result = findKthLargest(largest,2);
            System.out.println("find the kth largest element is "+result);
        }
    }


