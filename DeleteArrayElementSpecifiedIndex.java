public class DeleteArrayElementSpecifiedIndex {
    public static int[] deleteArray(int [] arr,int index){
        if (index < 0 || index >arr.length){
            System.out.println("index not in the range");
            return  arr;
        }
        int array [] = new int[arr.length-1];
        for (int i =0; i<array.length; i++){
            if (i<index){
                array[i] =arr[i];
            }
            else {
                array[i] = arr[i+1];
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int indexToDelete = 3;
        arr = deleteArray(arr, indexToDelete);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
