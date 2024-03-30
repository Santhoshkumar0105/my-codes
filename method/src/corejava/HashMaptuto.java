package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaptuto {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		//HashMap m=new HashMap<>();
		m.put(202, "hey");
		m.put(101, "java");
		m.put(105, "hello");
		m.put(201, "hii");
		m.put(202,"you");
		m.put(303, "java");
		System.out.println(m);
		//System.out.println(m);
	      /*System.out.println(m.get(101));
	      m.remove(105);
	      System.out.println(m);
	      System.out.println(m.get(202));
			System.out.println(m.containsKey(303));
			System.out.println(m.containsValue("you"));
			System.out.println(m.keySet());
			System.out.println(m.values());
			System.out.println(m.entrySet());
	        Set s=m.keySet();
	        System.out.println(s);
	        */
	      for(var i:m.keySet())
	      {
	    	  System.out.println(i);
	      }
	      
	      for(String j:m.values())
	      {
	    	  System.out.println(j);
	      }
	      for(Object k:m.entrySet())
	      {
	    	  System.out.println(k);
	      }
	      
	      
	      for(Map.Entry e:m.entrySet())
	      {
	    	  System.out.println(e.getKey()+"  "+e.getValue());
	      }

	      }
	    	 

		}
	


