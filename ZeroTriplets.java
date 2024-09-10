import java.util.Arrays;

public class ZeroTriplets {
        public static void findTriplets(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {-1, 0, 1, 2, -1, -4};
            findTriplets(array);
        }
    }



