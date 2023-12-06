package inputAndOutputStreams;

import java.io.*;

public class WriteCharacterToFile {
    public static void main(String[] args) {
        try{
            FileWriter fw= new FileWriter("abc.txt");
            fw.write('A');              //writes the character a to the file.
            fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
 