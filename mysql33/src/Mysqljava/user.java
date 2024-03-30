package Mysqljava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student1 {
	private int age;
	private String name;

	public student1(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student1 [age=" + age + ", name=" + name + "]";
	}
}

public class user implements Comparator<student1> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 obj=new student1(23,"xxx");
		student1 obj1=new student1(24,"yyy");
		student1 obj2=new student1(25,"zzz");
		
		List<student1> al=new ArrayList<>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		
		
		Collections.sort(al, new user());
		for(student1 st : al) {
			System.out.println(st);
		}
	}

	public int compare(student1 o1, student1 o2) {
		student1 s1 = (student1) o1;
		student1 s2 = (student1) o2;
		int s3 = s1.getName().compareTo(s2.getName());
		if (s3 == 0) {
			return 0;
		} else if (s3 > 0) {
			return 1;
		}
		return -1;
	}
}
