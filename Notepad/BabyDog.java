//example of multi level inheritance

class Animal {
    void eat() {
        System.out.println("Eating.....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }

}

public class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }

    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}
