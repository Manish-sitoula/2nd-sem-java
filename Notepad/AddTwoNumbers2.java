// Define a class named "Addition"
class Addition {
    // Instance variables to hold the two numbers
    int num1;
    int num2;
    
    // Method to perform addition and return the result
    int add() {
        return num1 + num2;
    }
}

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        // Create an object of the "Addition" class
        Addition obj = new Addition();
        
        // Assign values to the instance variables
        obj.num1 = 10;
        obj.num2 = 20;
        
        // Call the "add" method to get the result and print it
        int sum = obj.add();
        System.out.println("The sum of " + obj.num1 + " and " + obj.num2 + " is: " + sum);
    }
}
