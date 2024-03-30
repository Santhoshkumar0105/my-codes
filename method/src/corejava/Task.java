package corejava;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Collections;


public class Task implements Comparable<Task>{
	Integer id;
	String name;
	String job;
	Integer salary;
	Task(Integer id,String name,String job,Integer salary){
		this.id=id;
		this.name=name;
		this.job=job;
		this.salary=salary;
	
	}
	
	public int compareTo(Task o) {
		Task a=(Task)o;
		Integer b=o.id.compareTo(id);
		if(b<1)
			return-1;
		else if(b>1)
			return +1;
		else
			return 0;
	}
	public String toString() {
		return id+" "+name+" "+job+" "+salary;
	}
	
	
	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		al.add(new Task(2,"Naveen","developer",200000));
		al.add(new Task(1,"Dilli babu","developer",100000));
		al.add(new Task(4,"Santhosh","developer",300000));
		Collections.sort(al);
          System.out.println(al);
	
	

		}
	
 
}
