import java.util.Scanner; //this programme printa a table

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        for( int i=1; i<21; i++){
            System.out.println(n+"x"+i+"="+" "+n*i);
        }
        
    }
}