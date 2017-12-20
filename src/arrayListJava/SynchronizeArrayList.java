package arrayListJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


//How to Synchronize ArrayList in Java
public class SynchronizeArrayList {
    /*
    The JDK Collections class has several method to create synchronized List, Set and Map and we will
    use Collections.synchronizedList() method to make our ArrayList synchronized. This method accepts
     a List which could be any implementation of List interface e.g. ArrayList, LinkedList and returns a
     synchronized (thread-safe) list backed by the specified list.

    */

    public static void main(String[] args) {

        List<String> citiesInBangladesh  = new ArrayList<String>();
        citiesInBangladesh.add("Dhaka");
        citiesInBangladesh.add("Mymensingh");
        citiesInBangladesh.add("Chittagong");
        citiesInBangladesh.add("Khulna");
        //Synchronizing ArrayList in Java
        citiesInBangladesh = Collections.synchronizedList(citiesInBangladesh);
        synchronized (citiesInBangladesh)
        {
            Iterator<String> iterator = citiesInBangladesh.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    }
}
