public class variable2{

	static int b=10;  //static variable
	int c=5;	  //instance variable
	void print(){
		System.out.println("this program shows 3 thpes of variables");
	}
		
		public static void main(String args[]){
			Variable obj=new Variable();
			obj.print();
			int a=5; //local variable
			System.out.println(a);
			System.out.println(Variable2.b);
			System.out.println(obj.c);
		
		}



}