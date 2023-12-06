public class Global {
    int a = 5, b = 6;// instance variable

    void addition() {
        int sum = a + b;
        System.out.println("sum is" + sum);
    }

    public static void main(String[] args) {
        Global a = new Global();
        a.addition();
    }
}
