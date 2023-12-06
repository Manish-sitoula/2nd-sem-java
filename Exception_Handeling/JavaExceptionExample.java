package Exception_Handeling;

public class JavaExceptionExample {

    public static void main(String[] args) {

        int a = 4, b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("you got error");
            System.out.println("Hello World");
        }

    }

}