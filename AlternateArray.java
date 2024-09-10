public class AlternateArray {

    public static void main(String[] args) {
        int[] array ={1,2,4,6,8};
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("after alterating ");
        int a=0,temp;
        while(a< array.length-1){
            temp=array[a];
            array[a]=array[a+1];
            array[a+1]=temp;
            a+=2;
        }
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
