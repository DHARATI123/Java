package jdbc;

import java.sql.*;

public class Testconnection {
  
	public static void main(String[] args) {
		Connection con=null;
		int empid=101;
		String empnam="abc";
		float empsal=1000;
		PreparedStatement ps=null;
		try{
		Class.forName("oracle.jdbc.OracleDriver");
	 con=DriverManager.getConnection("jdbc.Oracle:thin:@localhost:1521:XE","system","Dharati@2000");
	System.out.println("connection to DB ");
	System.out.println("done");
	
	//PreparedStatement ps=con.prepareStatement("insert into emp15 values(?,?,?)");
	//ps.setInt(1, empid);
	//ps.setString(2, empnam);
	//ps.setFloat(3, empsal);	
	//int i=ps.executeUpdate();
	//if(i>0){
		//System.out.println("save");
//	}
	System.out.println("enter the empid to be deleted");
	int empid=sc.nextInt();
	ps=con.PreparedStatement("delete into emp15 where empid=?");
	ps.setInt(1, empid);
	}
	catch(Exception e){
		System.out.println("Exception is:"+e);
	
		
	}
	}
	}
	
