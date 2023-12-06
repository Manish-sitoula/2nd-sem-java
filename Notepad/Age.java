import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not adult");
        // }
        String output =  (age > 18) ? "Adult": "Child";
        System.out.println(output);


    }
}
