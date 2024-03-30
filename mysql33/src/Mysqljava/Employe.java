package Mysqljava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employe implements Comparable<Employe>
{
	
	private int age;
	private String name;
	
	public Employe(int age, String name)
	{ 
		
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Employe o) 
	{
		if(this.age==o.age) 
		{
		
		return 0;
		}
		else if(this.age>o.age) 
		{
			return 1;
		}
		else 
		{
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Employe [age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Employe emp=new Employe(10,"san");
		Employe emp1=new Employe(20,"navi");
		Employe emp2=new Employe(30,"akash");
		Employe emp3=new Employe(40,"vino");
		
		List<Employe> ll= new ArrayList<>();
		ll.add(emp);
		ll.add(emp1);
		ll.add(emp2);
		ll.add(emp3);
		
		Collections.sort(ll);
		 for(Employe ep:ll) {
		 System.out.println(ep);
	
		 }
	}
}
