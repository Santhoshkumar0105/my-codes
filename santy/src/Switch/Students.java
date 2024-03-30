package Switch;
import java.util.*;
public class Students{
	private int id;
	private String name;
	Students(int id,String name) {
		this.id=id;
		this.name=name;
	}
		public int getid() {
			return id;
		}
		public String getname() {
			return name;
		}
}
class CollectionList{
	
            public static void main(String[] args) {
            	List<Students> al= new ArrayList<>();
            	al.add(new Students(1,"santhosh"));
            	al.add(new Students(2,"akash"));
            	for(Students li:al) {
            		System.out.println(li.getid()+"  "+li.getname());
            	}
            	
            	
            }
	

	}


