package String;
import java.util.ArrayList;
public class Arraychumma4 {

	public static void main(String[] args) {
		int count=0;
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(8);
		al.add(6);
		al.add(3);
		al.add(1);
		al.add(7);
		int n=al.size();
		for(int i=0;i<n;i++) {
			if(n==al.get(i)) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("it will exist");
		}
		else {
			System.out.println("it not exist");
		}

	}

}
