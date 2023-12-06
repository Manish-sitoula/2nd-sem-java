class Calculator{
     int num1=10;
     int num2=20;
     int result;

     int add(){
result=num1+num2;
return result;

     }
}
class Calculator1{
    public static void main(String[] args) {
        Calculator obj =new Calculator();
      System.out.println(obj.add());  
    }
}