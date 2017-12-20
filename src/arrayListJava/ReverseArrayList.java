package arrayListJava;
// How to reverse ArrayList in Java

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {

    /* We can reverse ArrayList in Java by using the reverse() method of java.util.Collections class */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList  = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //Also works fine for String as well
        System.out.println("Before reversing: "+arrayList);

        Collections.reverse(arrayList);

        System.out.println("After reversing: "+arrayList);


    }

}
