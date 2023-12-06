public class ConstructorChain {
    ConstructorChain()
    {
        this(5);
        System.out.println("This is no-argument Constructor");
        }
      ConstructorChain(int a)
      {
        this(5,10);
        System.out.println("One Parameter constructor"+a);
       
    }
       ConstructorChain(int a,int b)
       {
        System.out.println("Two parameter"+a +" "+b);
       }

       public void run(){
        System.out.println("It is working");
       }
       public static void main(String []args) {
        ConstructorChain cc =new ConstructorChain();
                cc.run();
                
       }
}
