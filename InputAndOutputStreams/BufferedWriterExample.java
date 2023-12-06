import java.io.*;


public class BufferedWriterExample {
    public static void main(String[] args) 
        throws Exception{
            FileWriter writer=new FileWriter("file.txt");
            BufferedWriter buffer=new BufferedWriter(writer);
            buffer.write("Welcome to Balmiki");
            buffer.newLine();
            buffer.write("I am new student");
            buffer.close();
            System.out.println("Success");

        }
}    

