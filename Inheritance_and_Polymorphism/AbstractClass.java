//ABSTRACT CLASS EXAMPLE
abstract class Animal {
    abstract void eat();

    void run() {
        System.out.println("Running......");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Eating.....");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
    }
}
