import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a program of switch case which does the calculation of two number \n as you wish");
        
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        
        System.out.println(" Enter 1 for  : + (Addition) a + b:");
        System.out.println("Enter 2 for : - (Subtraction) a - b:");
        System.out.println("Enter 3 for : * (Multiplication) a * b:");
        System.out.println(" Enter 4  for : / (Division) a / b:");
        System.out.println("Enter 5 for  : % (Modulo or remainder) a % b:");
        
        //number section
        
        
        int s=sc.nextInt();
        switch(s){
            case 1:int c=a+b;
            System.out.println("your Sum is"+c);
            break;

            case 2:  c=a-b;
            System.out.println("your subtraction  is"+c);
            break;

            case 3:  c=a*b;
            System.out.println("your product  is_"+c);
            break;

            case 5:  c=a%b;
            System.out.println("your remainder is"+c);
            break;
   
            default:
            System.out.println("Invalid input");
        
            
            
            
        }
    }
}