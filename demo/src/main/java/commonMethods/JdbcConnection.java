package commonMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcConnection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		try
		{
			Class.forName("oracle.jdbc.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");  
			Statement stmt=con.createStatement();  
			ResultSet rs1=stmt.executeQuery("select * from employee where company='tcs'");
			while(rs1.next()) 
			{
				System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)); 
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
			
	}

