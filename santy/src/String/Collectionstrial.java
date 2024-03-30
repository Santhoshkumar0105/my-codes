package String;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
public class Collectionstrial {

	
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(20);
		ll.add(30);
		ll.add(40);
//    	ll.addFirst(10);
//		ll.addLast(50);
//	   	  System.out.println(ll);
//		  System.out.println(ll.getFirst());
//	    ll.removeFirst();
//		ll.removeLast();
//          System.out.println(ll);
//         for(int i=0;i<ll.size();i++) {
//       	  System.out.println(ll.get(i));
//         }
//        /* for(int a:ll) {
//        	  System.out.println(a);
//          }*/
//         Iterator i=ll.iterator();
//        		 while(i.hasNext()) {
//        			 System.out.println(i.next());
//        		 }
        		 ListIterator i2=ll.listIterator();
        		 while(i2.hasNext()) {
        			i2.next();
        		 }
        		 while(i2.hasPrevious()) {
        			 System.out.println(i2.previous());
        		 }
//		Stack<String> s=new Stack<>();
//		s.push("hii");
//		s.push("hello");
//		s.push("hey");
//		s.push("you");
//	//	System.out.println(s.pop());
//  //  System.out.println(s.peek());
//        System.out.println(s.search("hii"));
//        System.out.println(s);
//	}
	}
}
