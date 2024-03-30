package Mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqldata {

	

	public static void main(String[] args)throws SQLException {
		//get connection("");
		/*Connection san=DriverManager.getConnection("jdbc:mysql://localhost:3306/main",
				 "root", "root");
		Statement st=san.createStatement();
		ResultSet rs=st.executeQuery("select*from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}

        san.close();  */
        
   // -------- to insert values---///////////////////     
		
	/*	Connection jas =DriverManager.getConnection("jdbc:mysql://localhost:3306/main",
				   "root","root");
		PreparedStatement ps=jas.prepareStatement("insert into jas values(?,?)");
		ps.setInt(1,13);
		ps.setString(2,"jayam");
		int a=ps.executeUpdate();
		System.out.println(a);
		if(a==0)
			System.out.println("failed");
		else
			System.out.println("success");*/
        
        //////////////  to update the values  ///////////////
        
      /*  Connection sub = DriverManager.getConnection("jdbc:mysql://localhost:3306/main",
        		                      "root","root");
        PreparedStatement ps = sub.prepareStatement("update column emp_name from student where(?)");
        ps.setString(1,"santhosh");	
        int a=ps.executeUpdate();
        System.out.println(a);  */  
        
        
        ///////////////delete the values///////////////////
        Connection add = DriverManager.getConnection("jdbc:mysql://localhost:3306/main",
        		              "root","root");
        PreparedStatement ps= add.prepareStatement("delete from jas where id=?");
		ps.setInt(1, 1);
		
		int a=ps.executeUpdate();
		System.out.println(a);
	   // ResultSet as = ps.executeQuery("select *from jas");
		if(a==0)
		System.out.println("failed");
		else
     	System.out.println("success");
	   
////////////// Multi query in procedure in jdbc  ////////////////////
		

			
		
		
		
		
		
		
     
	}

}
