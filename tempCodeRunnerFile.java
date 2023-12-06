public class InstanceVariableExample {
    // Instance variable 'counter'
    int counter;

    public void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        InstanceVariableExample obj1 = new InstanceVariableExample();
        InstanceVariableExample obj2 = new InstanceVariableExample();

        obj1.incrementCounter();
        obj1.incrementCounter();

        obj2.incrementCounter();

        System.out.println("Counter in obj1: " + obj1.counter); // Output: 2
        System.out.println("Counter in obj2: " + obj2.counter); // Output: 1
    }
}
