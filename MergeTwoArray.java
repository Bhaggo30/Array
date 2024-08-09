import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,5,7,8};
        int [] array2 = {4,8,9,11,12};
        int length1 = array1.length;
        int length2 = array2.length;
        int[] array3 = new  int[length1+length2];
        int i =0;
        int j =0;
        int k =0;
        while (i<length1 && j<length2){
            if (array1[i] <array2[j]){
                array3[k++] = array1[i++];

            }
            else {
                array3[k++] =array2[j++];
            }
        }
        while (i<length1){
            array3[k++] = array1[i++];
        }
        while (j<length2){
            array3[k++] = array2[j++];
        }
        System.out.println(Arrays.toString(array3)+ " ");
    }
}
