class Employee {
    int salary = 10_000 * 12;
}

public class Executive extends Employee {
    int bonus = 3000 * 6;

    public static void main(String args[]) {
        Executive obj = new Executive();
        System.out.println("Total salary credited: " + obj.salary);
        System.out.println("Bonus of six months: " + obj.bonus);
    }
}