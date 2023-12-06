class Edit{

 void eat(){
	System.out.println("Eating ... ");
	}	
	
}
class Cow extends Edit{                                    //program to demonstrate hierarchical inheritance	
  	void milk(){
	System.out.println("Milking ...");
	}
	
}
class Time extends Edit{
   void date(){
	System.out.println("happy birthday...");
	}

}

class Search{
public static void main(String args[]){
	Time obj=new Time();
	obj.date();
	obj.eat();
	
	}


}
