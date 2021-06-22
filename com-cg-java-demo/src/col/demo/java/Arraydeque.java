package col.demo.java;

import java.util.ArrayDeque;

public class Arraydeque {
	public static void main(String[] args) {
		
	
ArrayDeque <Integer> mylist = new ArrayDeque <>();
   mylist.add(62);
   mylist.add(71);
   mylist.add(65);
   mylist.add(79);
   mylist.add(66);
   mylist.add(78);
   mylist.add(69);
   mylist.add(70);
   mylist.addFirst(67);
   mylist.addLast(45);
   System.out.println(mylist);
   System.out.println(mylist.getFirst());
   System.out.println(mylist.getLast());
   System.out.println(mylist.offerFirst(67));
}
}