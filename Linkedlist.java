import java.util.*;
class Linkedlist{
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("a"); //add element
        ll.add("b");
        ll.add("c");
        System.out.println(ll);
        ll.remove(2); //remove element
        ll.addFirst("f");  // add element to first
        System.out.println(ll);
        ll.add("t");
        ll.add("r");
        ll.get(3); //element at 3 index
        ll.addLast("z"); // add element to last
        System.out.println(ll);

    }
}