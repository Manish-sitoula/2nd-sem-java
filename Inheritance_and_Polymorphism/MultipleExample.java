//Implementing Multiple inheritacce in java using interface.

interface AanimalEat{
    void eat();
}
interface AanimalTravel{
    void travel();
}
class Aanimal implements AanimalEat,AanimalTravel{
    public void eat()
    {
        System.out.println("Eating....");
        
    }

public  void travel()
{
    System.out.println("Travelling...");
}
}
class MultipleExample{
    public static void main(String []args)
    {
        Aanimal a=new Aanimal();
        a.eat();
        a.travel();
    }
}
