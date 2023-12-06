import java.util.Scanner;

public class StringBufferReversee {
public static void main(String[] args) {
System.out.println("Enter any string to reverse:");
Scanner sc=new Scanner(System.in);
String input= sc.nextLine();
StringBuffer sb = new StringBuffer(input);
System.out.println("Original String:"+ sb);
sb.reverse();
System.out.println("Reversed String:" + sb);
}
}