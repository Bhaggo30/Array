public class EvenOddIndexArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 21, 32, 43, 54, 65, 76};

        System.out.println("Elements at even index positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + arr[i]);
            }
        }

        System.out.println("\nElements at odd index positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Index " + i + ": " + arr[i]);
            }
        }
    }
}
