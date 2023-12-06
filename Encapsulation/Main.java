class Person{                           // first encapsulation program.
    private int age;
    public void setAge(){
        age=20;
    }
    public int getAge() {
        return age;
    }
}
class Main {
    public static void main(String[] args){
        Person p1=new Person();
        p1.setAge();
        int a=p1.getAge();
        System.out.println("Age is "+a);
    }
}
 

    
