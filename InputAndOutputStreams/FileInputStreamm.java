package inputAndOutputStreams;

import java.io.*;

public class FileInputStreamm {
    public static void main(String[] args) {
        
        try{
            FileInputStream fin=new FileInputStream("abc.txt");
            int i=fin.read();
            System.out.println((char)i);
            fin.close();
        }
        catch (Exception e){ 
            System.out.println(e);
        }
    }
}
