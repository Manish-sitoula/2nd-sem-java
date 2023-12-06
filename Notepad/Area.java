import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float a=22/7*r*r;
        System.out.println("Your area is "+a);

    }
    
}
