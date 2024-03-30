package Mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PrimaryData{
	private String name;
	private String mobilenumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "PrimaryData [name=" + name + ", mobilenumber=" + mobilenumber + "]";
	}
}

class SecondryData{
	private String mobilenumber;
	private String address;
	
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SecondryData [mobilenumber=" + mobilenumber + ", address=" + address + "]";
	}
}

class DataBaseResponse{
	
	public List<PrimaryData> getPrimaryData(){
		List<PrimaryData> primdata = new ArrayList<PrimaryData>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select*from primaryData");
		
		while(rs.next()) {
			
			PrimaryData pd = new PrimaryData();
			
			String name = rs.getString("name");
			String mobilenumber = rs.getString("mobilenumber");
			
			pd.setName(name);
			pd.setMobilenumber(mobilenumber);
			
			primdata.add(pd);
		}
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return primdata;
		
	}
	
	public List<SecondryData> getSecondryData(){
		List<SecondryData> secondryData = new ArrayList<SecondryData>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select*from SecondryData");
		
		while(rs.next()) {
			
			SecondryData sd = new SecondryData();
			
			String mobilenumber = rs.getString("mobilenumber");
			String address = rs.getString("address");
			
			sd.setMobilenumber(mobilenumber);
			sd.setAddress(address);
			
			secondryData.add(sd);
		}
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return secondryData;
	}
}

public class Main {
	public static void main(String []args) {
	
		DataBaseResponse dbs = new DataBaseResponse();
		
		List<PrimaryData> primarydata = dbs.getPrimaryData();
		List<SecondryData> secondrydata = dbs.getSecondryData();
		
		Map<String, PrimaryData> primary= new HashMap<String, PrimaryData>();
		
		if(!primarydata.isEmpty()) {
			for(PrimaryData primaryData : primarydata) {
				if(primaryData.getMobilenumber() != null) {
					primary.put(primaryData.getMobilenumber(), primaryData);
				}
			}
		}
		if(!secondrydata.isEmpty()) {
			for(SecondryData secondryData : secondrydata) {
				if(secondryData.getMobilenumber() != null) {
					PrimaryData primdata = primary.get(secondryData.getMobilenumber());
					
//					primdata.getName();
//					primdata.getMobilenumber();
//					secondryData.getAddress();
					
					System.out.println(primdata.getName()+" "+primdata.getMobilenumber()+" "
					+secondryData.getAddress());
					
				}
			}
		}
}
}