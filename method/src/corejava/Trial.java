package corejava;
import java.util.HashMap;
import java.util.Map.Entry;
class Trial{
	int age;
	String name;
	int salary;
	 
	
	Trial(int age,String name,int salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
		 
	}
	public String toString() {
		return age+" "+name+" "+salary;
		
	}
	public static void main(String args[]) {
		HashMap<Integer,Trial> al=new HashMap<>();
		
		al.put (1323,new Trial(23,"santhosh",18988));
		al.put (3243,new Trial(26,"akash",22222));
		al.put (7533,new Trial(28,"naveen",30000));
	
	System.out.println("id   age  name  salary");
	System.out.println(" ");
	for(Entry<Integer, Trial> s:al.entrySet()) {
		System.out.println(s.getKey()+" "+s.getValue().age+" "+s.getValue().name+" "+s.getValue().salary);
	}

	}
}
		
		

	
		
		
			
		

	


