package corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Javatask1 {
	
			String name;
			
			Javatask1(String name){
				this.name=name;
			}
			public String toString() {
				return name;
			}
		}
	
public class Javatask {	
	public static void main(String []args) {
				Comparator<Javatask1> bb = (o1, o2)->{
					Javatask1 v = (Javatask1)o1;
				    Javatask1 v2 = (Javatask1)o2;
					if(v.name.length()>v2.name.length()) {
					return 1;}
					else if(v.name.length()<v2.name.length()){
					return -1;}
					return 0;};
				ArrayList ab = new ArrayList();
				ab.add(new Javatask1("i phone"));
				ab.add(new Javatask1("oppo"));
				ab.add(new Javatask1("vivo"));
				ab.add(new Javatask1("xami"));
				Collections.sort(ab, bb);
				System.out.println(ab);	
		
			}

}
