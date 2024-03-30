package String;     //......second largest number...........
import java.util.ArrayList;
public class Arraychumma3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(7);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(8);
		al.add(6);
		al.add(2);
		int n=al.size();
		System.out.println(n);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(al.get(i)>al.get(j)) {
					int s=al.get(i);
					al.set(i,al.get(j));
					al.set(j, s);
					
				}
			}
		}
		System.out.println(al);
		System.out.println("second lorgest element "+ al.get(n-2));
	}

}
