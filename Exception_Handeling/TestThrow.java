package Exception_Handeling;

public class TestThrow {
    public static void validate(int age) {
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not elegible to vote");
        }

        else {
            System.out.println("Person is elegible to vote");
        }

    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code....");

    }
}