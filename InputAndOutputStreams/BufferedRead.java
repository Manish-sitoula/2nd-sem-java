import java.io.*;

public class BufferedRead {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
            String line= reader.readLine();
            while(line!=null){
                //process the line
                System.out.println(line);
                line=reader.readLine();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    
}
