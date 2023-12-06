class VariableFinal {
    final int a = 2; 

    void display() {
        System.out.println("this is constant value:"  + a);
    }

    public static void main(String[] args) {
        VariableFinal obj = new VariableFinal();
        obj.display();
    }
}