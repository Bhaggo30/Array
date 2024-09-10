public class ThirdSmallest {

    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 78, 98, 55, 4};
        int firstSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstSmallest) {
                firstSmallest = arr[i];
            }
        }
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallest && arr[i] > firstSmallest) {
                secondSmallest = arr[i];
            }
        }
        int thirdSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < thirdSmallest && arr[i] > secondSmallest) {
                thirdSmallest = arr[i];
            }
        }
        System.out.println("First Smallest: " + firstSmallest);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Third Smallest: " + thirdSmallest);
    }
}
