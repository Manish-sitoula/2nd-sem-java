//Write a program in java to sum 2 numbers taking user defined method.
import java.util.Scanner;
public class Addition
 {
   
    public void add()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("Result is"+result);
        sc.close();
    }
    
        public static void main(String args[])
        {
            Addition ad=new Addition();
            ad.add();
        }
    
}