 class Demo{

     public void run()
    {
        System.out.println("running");
    }
}

class Honda extends Demo{
 public void run()
    {
        System.out.println("Running very fast");
    }
}
 class MethodOverwrite {
    public static void main(String []args) 
    {
        Honda h = new Honda();
        h.run();
    }
}
