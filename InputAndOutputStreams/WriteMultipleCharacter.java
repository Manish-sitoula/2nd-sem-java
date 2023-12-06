package inputAndOutputStreams;
import java.io.*;

public class WriteMultipleCharacter {
    public static void main(String[] args){
        try{
            FileReader reader=new FileReader("file.txt");
            int data=reader.read();
            while(data !=-1){
                //process the data
                System.out.println();
            }
        }
    }
    
}
