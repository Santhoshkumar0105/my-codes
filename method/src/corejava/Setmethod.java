package corejava;
import java.util.*;
public class Setmethod {
	int id;
	String name;
	String job;
	Setmethod(int id,String name,String job){
		this.id=id;
		this.name=name;
		this.job=job;
	}

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new Setmethod(1,"santhosh","developer"));
		al.add(new Setmethod(2,"akash","software"));
		System.out.println(al);
		
		
	}
	public String toString() {
		return id+" "+name+" "+job;
		
	}

}
 