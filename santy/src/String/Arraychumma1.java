package String;        //....duplicate values.........
import java.util.ArrayList;
public class Arraychumma1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(2);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==(al.get(j)) ){
					System.out.println(al.get(i));
				}
			}
		}

	}

}
