class Vehicles {
    String model = "BMW";
    int year = 2012;
    int speed = 70;

    void start() {
        System.out.println("Vehicels is getting start");
    }

    void stop() {
        System.out.println("Vechile is stop");
    }

    void speedUp() {
        int new_speed = speed;
        new_speed =speed+10;
        System.out.println(new_speed);
    }

    void speedDown() {
        int new_speed = speed;
        new_speed =speed-10;
        System.out.println(new_speed);
    }
}

class Car extends Vehicles {

    String color="Red";
    int fuel=100;
    boolean Isruning=true;

    

    void details() {
        System.out.println(color);
        System.out.println(fuel+"%");
        System.out.println(Isruning);
    }
}

public class Exam2 {
    public static void main(String args[]) {

        Car obj = new Car();
        obj.details();
        obj.start();
        obj.stop();
        obj.speedUp();
        obj.speedDown();
        
    }
}