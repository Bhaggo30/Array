public class FrequencyArray {
    public static void countFrequencies(int[] number) {
        boolean[] counted = new boolean[number.length];

        for (int i = 0; i < number.length; i++) {
            if (counted[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    count++;
                    counted[j] = true; // number is counted already
                }
            }
            System.out.println("Element " + number[i] + " occurs " + count + " times.");
        }
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 44, 76, 89, 23, 45, 1, 2, 3, 45};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        countFrequencies(number);
    }
}
