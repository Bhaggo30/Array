public class LongestSubString {
        public static int longestSubString(String str) {
            int max = 0;
            for (int i = 0; i < str.length(); i++) {
                String temp = " ";
                for (int j = i; j < str.length(); j++) {
                    if (!temp.contains(String.valueOf(str.charAt(j)))) {
                        temp += str.charAt(j);
                        max = Math.max(max, temp.length());
                    } else {
                        break;
                    }
                }
            }
            return max;
        }

        public static void main(String[] args) {
            String s = "abcabcc";
            String result = String.valueOf(longestSubString(s));
            System.out.println("longest substring of the string is " + result);
        }
    }




