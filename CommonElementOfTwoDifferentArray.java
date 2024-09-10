import java.util.Arrays;

public class CommonElementOfTwoDifferentArray {
    public static int[] insertion(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        int[] commonElements = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonElements[index++] = a[i];
                    break;
                }
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.print("print of elements array1 and array2"+ Arrays.toString(array1)+ " ,"+Arrays.toString(array2));

        int[] commonElements = insertion(array1, array2);

        System.out.println("Common elements: ");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
