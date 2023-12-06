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
        int present_speed = speed;
        present_speed += 10;
        System.out.println(present_speed);
    }

    void speedDown() {
        int present_speed = speed;
        present_speed -= 10;
        System.out.println(present_speed);
    }
}

class Car extends Vehicles {

    String color;
    int fuel;
    boolean Isruning;

    Car(String color, int f, boolean run) {
        this.color = color;
        this.fuel = f;
        this.Isruning = run;
    }

    void details() {
        System.out.println("Color:" + color);
        System.out.println("Fuel:" + fuel + "%");
        System.out.println("Is engine running:" + Isruning);
    }
}

public class Exam {
    public static void main(String arru[]) {

        Car obj = new Car("red",100,false);
        obj.details();
        obj.start();
        obj.stop();
        obj.speedUp();
        obj.speedDown();
        
    }
}