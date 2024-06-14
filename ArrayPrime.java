public class ArrayPrime {

        public static boolean isPrime(int val)
        {
            boolean flag=true;

            if(val==2||val==1)
                return false;
            for(int i=2;i<=val/2;i++)
            {
                if(val%i==0) {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
        public static void main(String[] args) {

            int [] prime = {1,2,6,9,11,13,66,77,88,99};
            for(int i =0; i<prime.length;i++) {
                boolean rs=isPrime(prime[i]);
                if(rs)
                    System.out.println("Prime"+prime[i]);
                else
                    System.out.println("Not Prime "+prime[i]);
            }
    }
}
