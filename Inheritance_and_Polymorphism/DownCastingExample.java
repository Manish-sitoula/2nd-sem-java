//Downcastingcasting example
class  Child{
   public void childData(){
        System.out.println("method of parent class");
    }
}
class Parent extends Child{
     public void printData(){
        System.out.println("method of child class");
    }
    
}
class DownCastingExample{
    public static void main(String []args){
     Child obj2=new Parent();
      obj2.childData();
    }
}