import java.sql.*;
import java.util.*;

class JdbcDemo3
{
	Connection con;
	PreparedStatement ps;

	JdbcDemo3(String n_name,String o_name)
	{
		try
		{
		// load derivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create Connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","123456");
		// Passing Query
		ps=con.prepareStatement("update jag set username=? where username=?");
		ps.setString(1,n_name);
		ps.setString(2,o_name);
		ps.executeUpdate();
		System.out.println("updated successfully....");
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
		String new_name,old_name;
		System.out.println("Enter New Username : ");
		new_name=s.nextLine();
		System.out.println("Enter Old Username : ");
		old_name=s.nextLine();
		
		new JdbcDemo3(new_name,old_name);
	}
}