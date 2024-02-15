package Advanced_java;

import java.util.ArrayList;

/**
 * This class contains information about Library management system
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 @author Raj Chauhan
  * @version 0.21.7
 * @since 2003
 * @see <a href="http://docs.oracle.com/en/java/javase/21/docs/api/index.html"target="_blank">Java docs</a>
 */
public class CH16_Creating_own_javadocs {
    public static void main(String[] args) {
        ArrayList<Integer> xr = new ArrayList<>();
        ArrayList<Integer> xsr = new ArrayList<>(5);
        xsr.add(21); //Inserts the specified element at the specified position in this list.
        xsr.add(40);
        xsr.add(50);
        xsr.add(68);
        xsr.add(75);
        xr.add(2);
        xr.add(40);
        xr.add(34);
        xr.add(18);
        xr.add(0, 42);
        System.out.println(xr.contains(40));

        System.out.println(xr.listIterator());
        System.out.println(xr.hashCode());
        System.out.println(xr.indexOf(42)); // gives the index
        xr.ensureCapacity(500); //Increases the capacity of the array
        xr.addAll(0,xsr);
        xr.clear();
        System.out.println(xr.clone());
        System.out.println(xr.contains(18));
        xr.remove(3);
        System.out.println(xr.set(4,43));
        for(int i = 0; i<xr.size(); i++) {
            System.out.print(xr.get(i));
            System.out.print(" ");
        }
    }
}
