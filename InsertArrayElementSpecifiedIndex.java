public class InsertArrayElementSpecifiedIndex {

        public static int[] insertArray(int[] arr, int index, int element) {
            if (index < 0 || index > arr.length) {
                System.out.println("Index not in the range");
                return arr;
            }
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = arr[i];
            }
            newArray[index] = element;
            for (int i = index; i < arr.length; i++) {
                newArray[i + 1] = arr[i];
            }
            return newArray;
        }
    public static void main (String[]args){
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();

                int indexToInsert = 3;
                int elementToInsert = 99;
                arr = insertArray(arr, indexToInsert, elementToInsert);

                for (int i : arr) {
                    System.out.print(i + " ");
                }
            }
        }



