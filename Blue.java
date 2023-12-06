// example simple/single inheritance
class Animal{
String name="Dog";
	void eat(){
	System.out.println("Eating");	
		}	
}
 class Dog extends Animal{
	void bark(){
	System.out.println("I am"+" "+name);
	System.out.println("barking....");
		}
	
	}
class Blue{
	public static void main(String args[]){
	Dog obj=new Dog();
	obj.bark();
	obj.eat();
		
	}	
}