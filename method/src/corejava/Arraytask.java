package corejava;
import java.util.ArrayList;

public class Arraytask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(3);
		al.add(5);
		al.add(10);
		al.add(0);
		al.add(7);
		al.add(8);
		al.add(0);
		al.add(3);
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
			if(al.get(i)%2==0&&al.get(j)) {
					System.out.println(al.get(i));
			}
			
	}
//		System.out.println("It is even number");
//		for(int j=0;j<arr.length;j++) {
//			if((arr[j]%2==0)) {
//				System.out.println(+arr[j]);
//			}
//			
//		}
		
					
				
		}
	}
}

	


