public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10,20,37,40,55};
        System.out.println("number are:-");
        String even="";
        String odd="";
        for(int i =0; i<=arr.length-1; i++) {

            if(arr[i]%2==0)
                even+=","+arr[i];
            else
                odd+=","+arr[i];
        }
        System.out.println("Even numbers are :-"+even);
        System.out.println("Odd numbers are :- "+odd);


    }
}
