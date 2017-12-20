package arrayListJava;
//How to remove duplicates from ArrayList in Java?

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*simplest approach to remove repeated objects from ArrayList is to copy them to a Set e.g.
 HashSet and then copy it back to ArrayList. This will remove all duplicates without writing any more code.
*/
public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        List<Integer> primeNumbers  = new ArrayList<Integer>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(7);
        primeNumbers.add(11);

        System.out.println("List of Prime Numbers:"+primeNumbers);

        // Now let's remove duplicate element without affecting order
        // LinkedHashSet will guaranteed the order
        // and since it's set  it will not allow us to insert duplicates.
        // repeated elements will automatically filtered.

        Set<Integer> primesWithoutDuplicate  = new LinkedHashSet<Integer>(primeNumbers);

        // now let's clear the ArrayList so that we can copy all elements from LinkedHashSet primes.clear();

        primeNumbers.clear();
        primeNumbers.addAll(primesWithoutDuplicate);
        System.out.println("List of Prime Numbers without duplicates: "+primeNumbers);






    }



}
