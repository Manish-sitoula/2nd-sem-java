//WAP in java to input a string and count numbers of vowels and consonant.

import java.util.Scanner;
public class CountVowelConsonant{
    public static void main (String[] args){

        int i,vCount=0 ,cCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word");
        String str=sc.nextLine();
        
        str=str.toLowerCase();
        
         

        for(i=0; i< str.length(); i++){
          if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u'){
            vCount++;
          }  else{
            cCount++;
          }
           
        }
         System.out.println("Total number of Vowel is "+ vCount);
            System.out.println("Total number of Consonant  is "+ cCount);
           
    }


}