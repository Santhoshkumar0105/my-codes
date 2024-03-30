package Switch;               //.....ascending order in ArrayLIst.........................
import java.util.ArrayList;
import java.util.*;

public class Arraytasks {

	static Collections collections;

	public static void main(String[] args) {
		ArrayList<Integer> object=new ArrayList<>();
		object.add(3);
		object.add(9);
		object.add(7);
		object.add(5);
		object.add(1);
		object.add(8);
		object.add(0);
		object.add(2);
		object.add(4);
		object.add(6);
 
		 collections.sort(object);

		System.out.println("acending order"+ object);
	}

}
