public class SumOfArray {
    public static void main(String[] args) {

        int [] array ={10,12,34,56,23,58};
        int sum =0;

        for(int i =0; i<array.length;i++){
            sum +=array[i];

        }
        System.out.println("total sum of an array:-"  +sum);

    }
}
