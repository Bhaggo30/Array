public class LengthOfLongestIncreasingSubseqence {
        public static int longestSubsequence(int[] num) {
            if (num == null || num.length == 0) {
                return 0;
            }
            int[] arr = new int[num.length];
            arr[0] = 1;
            int maxLength = 1;
            for (int i = 1; i < num.length; i++) {
                arr[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (num[i] > num[j]) {
                        arr[i] = Math.max(arr[i], arr[j] + 1);
                    }
                }
                maxLength = Math.max(maxLength, arr[i]);
            }
            return maxLength;
        }

        public static void main(String[] args) {
            int[] array = {5, 9, 1, 7, 4, 10, 12};
            System.out.println(longestSubsequence(array));
        }
    }
