package Advanced_java;

import java.util.ArrayDeque;

public class CH15_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> cr = new ArrayDeque<>();
        cr.add(21);
        cr.add(40);
        cr.add(32);
        cr.add(95);
        cr.add(19);
        cr.add(53);
        cr.add(74);
        cr.add(48);
        System.out.println(cr.equals(21));
//        System.out.println(cr.clone());
//        cr.remove(95);
//        System.out.println(cr.clone());
//        System.out.println(cr.peekLast()); //Retrieves, but does not remove, the last element of this deque. returns null if the deque is empty
//        System.out.println(cr.peekFirst());//Retrieves, but does not remove, the first element of this deque. returns null if the deque is empty
//        System.out.println(cr.pollFirst());//Retrieves and removes the first element of this deque, or returns null if this deque is empty.
//        System.out.println(cr.pollLast());//Retrieves and removes the last element of this deque, or returns null if this deque is empty
//        System.out.println(cr.clone());
//        System.out.println(cr.getLast()); // Returns the last element of deque(use peek() instead)
//        System.out.println(cr.getFirst()); //Returns the first element of deque
//        cr.clear(); // clears the deque
//        System.out.println(cr.isEmpty()); //Returns true if this deque contains no elements.
//        cr.offerFirst(32);//Inserts the specified element at the front of this deque.
//        cr.offerLast(78);//Inserts the specified element at the last of this deque.
//        System.out.println(cr.clone());
//      System.out.println(cr.clone()); //Returns a copy of this deque.
//        System.out.println(cr.peekFirst());//Retrieves, but does not remove, the first element of this deque.

    }
}
