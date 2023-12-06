class Animall{                               // Example of Hierarchical inheritance 
    public void eat(){
        System.out.println("Animal can Walk");
    }

}
class Dogy extends Animall{
    public void bark(){
        System.out.println("Dog can Bark");
    }
}
class Cow extends Animall{
    public void milk(){
        System.out.println("Cow gives Milk");
    }
}
class HierarchicalInheritance{
    public static void main(String args[]) {
        Dogy obj=new Dogy();
        obj.bark();
        Cow obj2=new Cow();
        obj2.eat();
        obj2.milk();


        
    }
}