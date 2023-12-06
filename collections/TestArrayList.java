package collections;

import java.util.*;


public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> set=new ArrayList<String>();
        set.add("Ravi");
        set.add("Gopal");
        set.add("Ravi");
        set.add("Shyam");
        //traversing elements
        Iterator<String> itrr=set.iterator();
        while(itrr.hasNext()){
            System.out.println(itrr.next());
        
    }
        
    }
}
