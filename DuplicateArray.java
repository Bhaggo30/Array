import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {

        int [] arr ={1,3,5,6,7,3,1,};
        Set<Integer> uniqueNumber = new HashSet<Integer>();
        boolean isDuplicateExit = false;
        for (int i =0; i< arr.length; i++){
            if (uniqueNumber.contains(arr[i])) {
                isDuplicateExit = true;
                System.out.println("duplicate elements are :" + arr[i]);
            }
            else {
                uniqueNumber.add(arr[i]);
            }
        }
        if (! isDuplicateExit){
            System.out.println(-1);
        }
    }
}
