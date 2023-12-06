class Animal{
	void eat(){
	System.out.println("Eating...");
	}
	
}                                               //Program to demonstrate multilevel inheritance
class Dog extends Animal{
	void bark(){
	System.out.println("Dog is barking");
	}
	
}
class BabyDog extends Dog{
	void weep(){
	System.out.println("Weeping...");
	}
}

class Four{
	public static void main(String args[]){
	BabyDog obj=new BabyDog();
	obj.eat();
	obj.weep();
	obj.bark();
	
	}
}