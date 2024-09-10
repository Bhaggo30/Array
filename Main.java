import java.util.Arrays;

public class Main {
    public static int[] commonmBetwwenTwoArray(int [] x, int[] y){
        int count =0;
        for (int i =0; i<x.length; i++){
            for (int j =0; j<y.length; j++){
                if (x[i] == y[j]){
                    count++;
                    break;
                }
            }
        }
        int [] common = new int[count];
        int index =0;
        for (int i =0; i< x.length; i++){
            for (int j =0; j<y.length; j++){
                if (x[i] == y[j]){
                    common[index++] = x[i];
                }
            }
        }
        return common;
    }
    public static void main(String[] args) {
        int [] x = {1,3,5,7,9,10};
        int [] y = {2,6,8,4,2,10};

        System.out.println("common are:");
        System.out.println(Arrays.toString(x)+" "+Arrays.toString(y));
        int []commonElement = commonmBetwwenTwoArray(x,y);
        for (int element : commonElement)
        System.out.println(element);


    }
}
