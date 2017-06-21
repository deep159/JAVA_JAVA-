import java.sql.*;
import java.util.*;

class JdbcDemo2
{
	Connection con;
	PreparedStatement ps;

	JdbcDemo2(String username,String password)
	{
		try
		{
		// load derivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create Connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","123456");
		// Passing Query
		ps=con.prepareStatement("insert into jag(username,password) values(?,?)");
		ps.setString(1,username);
		ps.setString(2,password);
		// execute query and get result
		ps.executeUpdate();
		System.out.println("Data inserted successfully...");
		
		con.close();
		}
		catch(Exception e)
		{
		System.out.println("error : "+e);	
		}
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("Enter username : ");
		username=s.nextLine();
		System.out.println("Enter Password : ");
		password=s.nextLine();
		new JdbcDemo2(username,password);
	}
}