public class Add2 {
    void add(){
        int a=5;int b=5;
        System.out.println("your sum is"+" "+(a+b));
    }
    void sub(){
        int a=5;int b=5;
        System.out.println("your subtract is"+" "+(a-b));
    }
    void product(){
        int a=5;int b=5;
        System.out.println("your product is"+" "+(a*b));
    }
    void divison(){
        int a=5;int b=5;
        System.out.println("your divison is"+" "+(a/b));
    }

     public static void main(String[] args) {
        Add2 sum=new Add2();
        sum.add();
        sum.sub();
        sum.product();
        sum.divison();
        
    }
}
