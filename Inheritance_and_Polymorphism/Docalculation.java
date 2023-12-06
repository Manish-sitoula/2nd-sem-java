 interface Calculator {
   public void addition();
}
class Add implements Calculator{
 public void addition()
    {
        int a=5,b=6,sum;
        sum=a+b;
        System.out.println("Sum is "+sum);
    }
}
class Docalculation{
    public static void main(String []args) 
    {
        Add a=new Add();
        a.addition();
    }
}
