public class ThirdLargest {
    public static void main(String[] args) {
        int[] array ={10,14,67,89,34,22};
        int firstLargest =array[0];
        for (int i =0;i<array.length;i++){
            if(firstLargest<array[i])
                firstLargest =array[i];
        }
        int secondLargest=Integer.MIN_VALUE;
        for (int i =0;i<array.length;i++){
            if(array[i]>secondLargest && array[i]<firstLargest)
                secondLargest=array[i];
        }
        int thirdLargest=Integer.MIN_VALUE;
        for (int i =0;i<array.length;i++){
            if(array[i]>thirdLargest&&array[i]<secondLargest)
                thirdLargest=array[i];
        }
        System.out.println(thirdLargest);
    }
}
