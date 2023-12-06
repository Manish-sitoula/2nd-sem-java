public class ParameterConstructor {
    ParameterConstructor(int a, int b) {
        int sum = a + b;
        System.out.println("sum is" + sum);
    }

    public static void main(String[] args) {
        new ParameterConstructor(7, 6);

    }
}
