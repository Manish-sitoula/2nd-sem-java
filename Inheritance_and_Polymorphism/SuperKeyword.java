//use of super keyword
// 1)in case of two variable are same of parent class and child class we use super keyword to prefer parent class variable.



class Phone {
    String color = "White";
}

class SAM extends Phone {
    String color = "black";

    void printColor() {
        System.out.println(color);// prints child class color
        System.out.println(super.color);// prints parent class color
    }

}

class SuperKeyword {
    public static void main(String[] args) {
        SAM d = new SAM();
        d.printColor();
       
    }
}