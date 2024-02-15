package Advanced_java;

import java.util.ArrayList;
import java.util.LinkedList;

public class CH15_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> xr = new LinkedList<>();
        LinkedList<Integer> xsr = new LinkedList<>();
        xsr.add(21); //Inserts the specified element at the specified position in this list.
        xsr.add(40);
        xsr.add(50);
        xsr.add(68);
        xsr.add(75);
        xr.add(2);
        xr.add(7);
        xr.add(34);
        xr.add(2);
        xr.add(0, 42);
//        xr.addLast(2); //Appends the specified element to the end of this list.
//        xr.addFirst(21); //Inserts the specified element at the beginning of this list.
        System.out.println(xr.lastIndexOf(2)); //Returns the last occurrence of the entered element
        System.out.println(xr.offer(32));//Adds the specified element as the tail (last element) of this list.
        System.out.println(xr.offerFirst(82));//Inserts the specified element at the front of this list.
        System.out.println(xr.offerLast(89));//Inserts the specified element at the end of this list.
        System.out.println(xr.pop());
        xr.push(323);//Pushes an element onto the stack represented by this list.similar to addfirst method
        for(int i = 0; i<xr.size(); i++) {
            System.out.print(xr.get(i));
            System.out.print(" ");
        }
//        System.out.println(xr.listIterator());
//        System.out.println(xr.hashCode());
//        System.out.println(xr.indexOf(42)); // gives the index
//        xr.addAll(0,xsr); // Inserts all of the elements in the specified collection into this list, starting at the specified position.
//        xr.clear(); //Empties the array
//        System.out.println(xr.clone()); // clone the array elements
//        System.out.println(xr.contains(18)); // Returns true if this list contains the specified element.


    }
}
