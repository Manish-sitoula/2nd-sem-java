// take a string input from user and reverse it ?  

import java.util.*;
public class StringReverse {
     public static void main(String[] args) {
        System.out.println("Enter a String to reverse");
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        


        StringBuilder sb =new StringBuilder(input);

        for(int i=0; i<sb.length()/2; i++){
            int font=i;
            int back=sb.length()-1-i;

            char fontChar=sb.charAt(font);
            char backChar=sb.charAt(back);

            sb.setCharAt(font, backChar);
            sb.setCharAt(back, fontChar);
        }
        System.out.println("Reversed string :"+sb);
     }
}
