class A {
    public void run() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public  void bclass() {
        System.out.println("This is class B");
    }

}

public class Single {
    public static void main(String[] args) {
        B obj = new B();
         obj.run();
         obj.bclass();
        

    }
}
