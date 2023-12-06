package collections;

import java.util.*;

public class TestHash {
    public static void main(String[] args) {
        // creating hashset and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Gopal");
        set.add("Ravi");
        set.add("Shyam");
        //traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
