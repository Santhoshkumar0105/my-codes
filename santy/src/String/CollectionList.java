package String;
import java.util.ArrayList;
public class CollectionList {

	public static void main(String[] args) {

	ArrayList<Integer> al=new ArrayList<>();
	al.add(2);
	al.add(4);
	al.add(5);
	al.add(2);
	al.add(null);
	al.add(0,1);
	al.set(0, 100);
	System.out.println(al);
	ArrayList li=new ArrayList<>();
	li.add(2);
	li.add('A');
	li.add("hii");
	li.addAll(al);
	System.out.println(li);
	System.out.println(li.get(2));
	System.out.println(li.size());
	System.out.println(li.contains("hii"));
	li.remove(0);
	System.out.println(li);
	System.out.println("al values" + al);
	System.out.println("li values" + li);
	//li.removeAll(al);
	//System.out.println("li values"+ li);
	li.retainAll(al);
	System.out.println("li values"+li);
	li.clear();
	System.out.println(li);
	System.out.println(li.isEmpty());
	
	
	}

}
