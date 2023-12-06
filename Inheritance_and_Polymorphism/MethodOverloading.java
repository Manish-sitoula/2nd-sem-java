public class MethodOverloading {          //Example of method overloading.
    void addition(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum of two numbers= "+sum);
    }
    void addition(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("Sum of three numbers= "+sum);
    }
    public static void  main(String []args) {
        MethodOverloading oe=new MethodOverloading();
        oe.addition(5, 5, 5);
        oe.addition(5, 5);
        
    }
}
