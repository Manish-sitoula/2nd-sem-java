//example of default constructor
class Green{
	int a; String name; boolean b;
	
	Green(){
	 a=500;  name="Rajesh"; b=true;

		}

	void show(){
	System.out.println(a+" "+name+" "+b);
	}


}
class Red{
	
public static void main(String args[]){
	Green obj=new Green();
	obj.show();	
	}	
		
}