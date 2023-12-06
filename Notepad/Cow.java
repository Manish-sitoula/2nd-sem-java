public class Variable{
	static int b=10;  //static variable
	int c=20;         //instance variable
	
	void print(){
		System.out.println("This program shows the three types of variables");
		}
	public static void main(String args[]){
	Variable obj=new Variable();
	obj.print();
	
	int a=5;          //local variable
	System.out.println(a);          //-------simply can call local variable inside a method.
	System.out.println(Variable.b); //-------uses class name to call static variable.
	System.out.println(obj.c);      //-------uses object reference to call inctance variable c. 
	
	
	}

}