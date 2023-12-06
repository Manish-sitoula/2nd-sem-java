// single inheritance example


class Employee{
    int salary=25000 * 12;
}

public class Money extends Employee{
    int bonus= 2000*6;

    public static void main(String[] args) {
        Money obj=new Money();
        System.out.println("Salary of whole year is"+" "+obj.salary);
        System.out.println("The bonus of six months is"+" "+obj.bonus);
    }

}