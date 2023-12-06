public class Exceptionjava {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b; // This line will throw ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
    }
}
