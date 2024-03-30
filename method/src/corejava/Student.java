package corejava;
import java.util.ArrayList;

public class Student implements Comparable<Student>{
	String name;
	byte age;
	int gpa;
	Student(String name,byte age,int gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
		
	}
	public Student(int i, String string, String string2, int j) {
		
	}
	public int compareTo(Student o) {
		if(gpa<o.gpa) {
			return 1;
		}
			else if(gpa>o.gpa) {
				return-1;
			}
			else {
				return 0;
			}
				
		}
		
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(new Student(2,"Naveen","developer",200000));
	al.add(new Student(1,"Dilli babu","developer",100000));
	al.add(new Student(4,"Santhosh","developer",300000));

	}
           Sysyem.out.println(al);
	}
 
