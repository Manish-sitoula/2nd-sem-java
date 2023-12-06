//Write a program in java to sum 2 numbers taking user input.
import java.util.Scanner;
public class Sum
 {
   
    public static void main(String args[]) 
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("Result is"+result);
        sc.close();
    }
}