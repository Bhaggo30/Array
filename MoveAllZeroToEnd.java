public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {4,0,0,3,12};
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int j =0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
        System.out.println("move all zeroes to the end");
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
