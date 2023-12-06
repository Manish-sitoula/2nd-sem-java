//parametrized constructor
class Student{
	 int id; String name;
	Student(int i, String n){
	id=i; name=n;	
	}
	void show(){
	System.out.println(id+" "+name);	
	}
}

class Student1{

public static void main(String args[]){
	Student obj=new Student(20,"Manish");
	Student objj=new Student(21,"Anu");
	obj.show();
	objj.show();
	}
}