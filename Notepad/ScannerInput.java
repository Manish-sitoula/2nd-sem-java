import java.util.Scanner;

public class ScannerInput{
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        System.out.println("your sum is"+" "+(a+b));
    }
    void sub(){
        int a=5;int b=5;
        System.out.println("your subtract is"+" "+(a-b));
    }
    void product(){
        int a=5;int b=5;
        System.out.println("your product is"+" "+(a*b));
    }
    void divison(){
        int a=5;int b=5;
        System.out.println("your divison is"+" "+(a/b));
    }

     public static void main(String[] args) {
        ScannerInput sum=new ScannerInput();
        sum.add();
        sum.sub();
        sum.product();
        sum.divison();
        
    }
}
