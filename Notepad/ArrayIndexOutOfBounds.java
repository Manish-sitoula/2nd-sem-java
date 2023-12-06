public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
            int value = numbers[3];  // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (Exception e) {
            System.out.println(e);
           
        }

    }
}
