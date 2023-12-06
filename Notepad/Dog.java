class Human{
    void live(){
        System.out.println("Living....");
    }
}

class Animal extends Human{
    void eat(){
        System.out.println("Eating....");
    }
}
public class Dog extends Human{
    void bark(){
        System.out.println("Barking.....");
    }
public static void main(String[] args){
        Dog obj=new Dog();
        obj.bark();
       
        obj.live();
}


}