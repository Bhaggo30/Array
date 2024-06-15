import org.w3c.dom.ls.LSOutput;

public class NumOrStringInArray {
    public static void main(String[] args) {
        String[] arr ={"11","33","2","tom","jerry","jack"};
        int integerCout=0;
        int strCount=0;
        for(String ele:arr)
        {
            try{
                Integer.parseInt(ele);
                integerCout++;
                System.out.println("integer:-"+ele);
            }
            catch (Exception e)
            {
                System.out.println("string:-"+ele);
                strCount++;
            }
        }
        System.out.println("Number of integers are "+integerCout);
        System.out.println("Number of string are "+strCount);
    }
}
