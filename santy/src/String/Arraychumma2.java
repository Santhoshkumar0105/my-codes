package String;           //......max & min value..........1
import java.util.ArrayList;
import java.util.Collections;
public class Arraychumma2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(103);
		al.add(83);
		al.add(45);
		al.add(53);
		al.add(93);
		al.add(33);
		al.add(23);
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)){
					int s = al.get(i);
					al.set(i,al.get(j));
					al.set(j,s);
				}
			}
		}
		System.out.println("min value" + "-" +al.get(0));
		System.out.println("max value" + "-" +al.get(al.size()-1));
			
		}

	}


