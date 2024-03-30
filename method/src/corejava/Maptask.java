package corejava;

import java.util.HashMap;
import java.util.Map.Entry;

class Maptask {
	
	int age;
	String name;
	int salary;
	
	Maptask(int age,String name,int salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return age+"-"+name+"-"+salary;
		
	}

	public static void main(String[] args) {

		HashMap<Integer,Maptask> al = new HashMap<>();
		
		al.put(1234, new Maptask(25,"santhosh",10000));
		al.put(5678, new Maptask(23,"naveen",200000));
		al.put(9012, new Maptask(24,"subin",300000));
		/*for(Entry<Integer, Maptask> m:al.entrySet()) {
			System.out.println(m);
			
		}
		System.out.println("______________________________");
		System.out.println("id    age    name     salary");
		System.out.println("______________________________");*/
		
		for(Entry<Integer,Maptask> s:al.entrySet()) {
			Maptask a=s.getValue();
			System.out.println(s.getKey()+"  "+a.age+"    "+a.name+"     "+a.salary);
			
		}
			
	
		
		
	}
	
	

}
