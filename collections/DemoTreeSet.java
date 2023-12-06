package collections;

import java.util.*;
public class DemoTreeSet{
    public static void main(String[] args) {
        //creating and adding elemrnts
        TreeSet<String>al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //traversing elemrntss
        Iterator<String>itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 

    }
}