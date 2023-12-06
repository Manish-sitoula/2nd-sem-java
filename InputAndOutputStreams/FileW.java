import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class FileW {
    public static void main(String[] args) throws Exception{
        FileWriter wr=new FileWriter("file.txt");
        BufferedWriter buffer=new BufferedWriter(wr);
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a line ");
        String a=sc.nextLine();
        buffer.write(a);
        buffer.close();
        System.out.println("Success");
    }

    
}
