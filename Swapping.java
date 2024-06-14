public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("original value of a and b "+a+ " "+b);
        a= a+b;
        b =a-b;
        a= a-b;
        System.out.println("values of a and b after swapping" +a+" "+b);

    }
}
