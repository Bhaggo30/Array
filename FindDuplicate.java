public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {12, 1, 1, 1, 2, 33, 44, 3, 3, 5, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println(" duplicate element are :"+ arr[i] + " ");
                count =0;



        }
    }
}
