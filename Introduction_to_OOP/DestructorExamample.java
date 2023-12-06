public class DestructorExamample {
    protected void finalize() {
        System.out.println("Object is Destroyed");
    }
     
    public static void main(String[] args) {
        DestructorExamample de = new DestructorExamample();
        de.finalize();
        System.gc();

    }
}
