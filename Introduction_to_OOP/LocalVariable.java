public class LocalVariable {
    void addition() {
        int a = 5;
        int b = 5;
        int sum = a + b;
        System.out.println("sum is" + sum);
    }

    public static void main(String[] args) {
        LocalVariable lv = new LocalVariable();
        lv.addition();
    }

}
