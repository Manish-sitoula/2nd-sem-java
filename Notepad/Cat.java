class Animal{
void eat(){
    System.out.println("Eating....");
}
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}

public class Cat  extends Animal{
    void meow(){
        System.out.println("Meowing....");
    }

    public static void main(String[] args ){
       Cat obj=new Cat();
       obj.meow();
       obj.eat();
       Dog objj=new Dog();
       objj.bark();

    }
    
}
