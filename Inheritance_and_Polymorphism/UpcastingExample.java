//Upcasting example
class Parentt{
   public void PrintData(){
        System.out.println("method of parent class");
    }
}
class Childd extends Parentt{
     public void PrintData(){
        System.out.println("method of child class");
    }
    
}
class UpcastingExample{
    public static void main(String []args){
      Parentt obj1 = new Childd();
      obj1.PrintData();
    }
}
