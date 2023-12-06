public class Compare {         //compares two strings are equal or not.
    public static void main(String[] args) {
        String first="java programming";
        String second="java programming";
        String third="python programmimg";
        String fourth="python programmimg";
        boolean result1=first.equals(second);
        System.out.println("String first and second are equal:"+result1);
        boolean result2=first.equals(third);
        System.out.println("String first and third are equal:"+result2);
        boolean result3=third.equals(fourth);
        System.out.println("String third and fourth are equal:"+result3);

        
    }
}
