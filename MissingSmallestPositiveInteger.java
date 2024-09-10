import java.util.HashSet;
import java.util.Set;

public class MissingSmallestPositiveInteger {
        public static int firstMissingPositive(int[] num) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < num.length; i++) {
                set.add(num[i]);
            }
            int j = 1;
            while (set.contains(j)) {
                j++;
            }
            return j;
        }

        public static void main(String[] args) {
            int[] number = {3, 4, -1, 1};
            int result = firstMissingPositive(number);
            System.out.println("First missing positive integer is " + result); // 2
        }
    }

