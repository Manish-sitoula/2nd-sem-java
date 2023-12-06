
public class StaticMethod {

    int a=10;
    static int b=20;

    static void show(){                //static method
        System.out.println("Show()"+b);
    }
 void display(){                        //non static,instance method
    System.out.println("display()"+a);
 }
    public static void main(String[] args){
        StaticMethod obj=new StaticMethod();
        obj.display();                     //instance method invoked using class object 
        StaticMethod.show();                // static method invoked using class name

    }

}

