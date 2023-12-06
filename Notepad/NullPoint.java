public class NullPoint {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // This line will throw NullPointerException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
