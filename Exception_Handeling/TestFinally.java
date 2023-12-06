package Exception_Handeling;

public class TestFinally {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){         //ArithmeticException e   ------runs both
            System.out.println(e);
            
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");
    }

}
