package Mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class producttask{
	private int productid;
	private  String productname;
	private  String description;
	private int price;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "producttask [productid=" + productid + ", productname=" + productname + ", description=" + description
				+ ", price=" + price + "]";
	}
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
		
}
class orderstask{
	private int productid;
	private String productname;
	private int price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "orderstask [productid=" + productid + ", productname=" + productname + ", price=" + price + "]";
	}
	
	
}
class productorders{
	     public List <producttask> setproducttask(){
	    	 List<producttask> protask = new ArrayList<>();
	    	 
	    	 try {
	    		 Class.forName("com.mysql.cj.jdbc.Driver");
	    			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash","root","root");
	    			Statement st = con.createStatement();
	    			ResultSet rs = st.executeQuery("select*from producttask");
	    			
	    			while(rs.next()) {
	    					    				
	    			  int productid = rs.getInt("product id");//same like in table
	    			  String productname = rs.getString("product name");
	    			  String description = rs.getString("description");
	    			  int price = rs.getInt("price");
	    		
	    				producttask pt = new producttask();  
	    			// class name
	    			  pt.setProductid(productid);
	    			  pt.setProductname(productname);
	    			  pt.setDescription(description);
	    			  pt.setPrice(price);
	    			  
                      protask.add(pt);
                     // list
	    			}
	    	 }
	    	 catch(Exception e) {
	    		 System.out.println(e);
	    	 }
	    	    return protask;
	         
}
   public List <orderstask> setordertask(){
	   List<orderstask> ordtask = new ArrayList<>();
  	 
  	 try {
  		 Class.forName("com.mysql.cj.jdbc.Driver");
  			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash","root","root");
  			Statement st = con.createStatement();
  			ResultSet rs = st.executeQuery("select*from orderstask");
  			
  			while(rs.next()) {
  				
  				
  			  int productid = rs.getInt("product id");
  			  String productname = rs.getString("product name");
  			  int price = rs.getInt("price");
  			  
				orderstask ot = new orderstask();
                 //classname 
  			 ot.setProductid(productid);
  			 ot.setProductname(productname);
  			 ot.setPrice(price);
  			  
                ordtask.add(ot);
               //list ref
  			}
  	 }
  	 catch(Exception e) {
  		 System.out.println(e);
  	 }
  	    return ordtask;
	   
   }
	   
}


public class Details {

	public static void main(String[] args) {
		
		productorders po = new productorders();
	                	
		List<producttask> lp = po.setproducttask();
		List<orderstask> lo = po.setordertask();
		
		Map<Integer,producttask> mpo = new HashMap<>();     //????????????
		             //????
		if(!lp.isEmpty()) {
			for(producttask data : lp) {
			   //class name
				if(data.getProductid()!= 0) {
					mpo.put(data.getProductid(),data);
				}                              //???
			}
		}
		if(!lo.isEmpty()) {
			for(orderstask type:lo) {
				if(type.getProductid()!=0) {
					producttask last=mpo.get(type.getProductid());
					System.out.println(last.getProductid()+" "+last.getProductname()
					               +" "+last.getDescription()+" "+last.getPrice());
					
				}
			} 
		}
		

	}

	

}
