import java.sql.*;

class JdbcDemo
{
	Connection con;
	PreparedStatement ps;
	ResultSet result;
	
	JdbcDemo()
	{
		try
		{
		// load derivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create Connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","123456");
		// Passing Query
		ps=con.prepareStatement("select * from jag");
		// execute query and get result
		result=ps.executeQuery();
		// get data from resultset
		while(result.next())
		{
			String uname=result.getString(1);
			String upass=result.getString(2);
			System.out.println(uname+"   "+upass);
		}
		// close connection
		con.close();
		}
		catch(Exception e)
		{
		System.out.println("error : "+e);	
		}
		
	}
	public static void main(String args[])
	{
		new JdbcDemo();
	}
}