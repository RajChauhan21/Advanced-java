package Advanced_java;

import java.util.HashSet;

public class CH15_Hash_Set {
    public static void main(String[] args) {
        // HASH - who uses hash fuction , SET - collections of unique items (No repetitions allowed)
        HashSet<Integer> hs = new HashSet<Integer>(10, 0.21f);
        hs.add(7);
        hs.add(18);
        hs.add(21);
        hs.add(25);
        hs.add(31);
        hs.add(31);
        System.out.println(hs);
//        hs.clear(); //Removes all of the elements from this set.
//        System.out.println(hs);
        System.out.println(hs.contains(21)); //Returns true if this set contains the specified element.
        System.out.println(hs.isEmpty());//Returns true if this set contains no elements.
        System.out.println(hs.size()); //Returns the number of elements in this set



    }
}
