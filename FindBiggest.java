public class FindBiggest {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int biggest =arr[0];
        for (int i =0; i< arr.length; i++){
            if (arr[i] > biggest){
                biggest = arr[i];
            }
        }
        int sum =0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];

        }
        System.out.println("sum of the eleemnt in an given array is "+sum);
        System.out.println("biggest element are :"+biggest);
    }
}
