package santy;
public class Students {
        int rollno;
		String name;
		String city;
		Students(int rollno,String name,String city)
		{
			this.rollno=rollno;
			this.name=name;
			this.city=city;
		}
		
	/*	public String toString()
		{                                           //.........to String..................
			return rollno+""+name+""+city;
			
		}*/
		public static void main(String[] args )
		{
			Students s1 = new Students(101,"santhosh","ponneri");
			Students s2 = new Students(102, "akash","minjur");
			System.out.println(s1);
			System.out.println(s2.hashCode());
		}
}
		

	
	

	


