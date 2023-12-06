                            
class Animaal{              // example of Multi Level Inheritance.
    public void eat()
{
System.out.println("Animal can eat");

}

}
class Doge extends Animaal{
    public void bark()
    {
        System.out.println("Dog Can Bark");

    }

}
class BabyDoge extends Doge{
    public void sleep(){
        System.out.println("Baby Dog is Sleeping");

    }
}
class MultiLevel{
    public static void main(String args[]) {
        BabyDoge obj=new BabyDoge();
        obj.bark();
        obj.eat();
        obj.sleep();
    }
}
