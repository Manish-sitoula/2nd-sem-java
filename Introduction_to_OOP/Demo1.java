public class Demo1 {
    int c;// this is the instance variable
    static int a = 1;

    void display() {
        int b = 0;
        a++;
        b++;
        System.out.println("Static " + a);
        System.out.println("Local " + b);
    }

    public static void main(String argu[]) {
        Demo1 obj = new Demo1();
        System.out.println("First time calling the method");
        obj.display();

        Demo1 obj1 = new Demo1();
        System.out.println("Second time calling the same method");
        obj1.display();
        obj.c = 12;
    }
}
