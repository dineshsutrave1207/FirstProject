package commonMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import utilities.PropertyHandler;
public class JdbcConnection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		try
		{
			String query="select * from employee where company='tcs'";
			PropertyHandler.loadpropertyfile("qaconfig");
			Class.forName(PropertyHandler.getProperty("dbconnectionclassname"));
			Connection con=DriverManager.getConnection(PropertyHandler.getProperty("dbconnection"),PropertyHandler.getProperty("dbusername"),PropertyHandler.getProperty("dbpassword"));  
			Statement stmt=con.createStatement();  
			ResultSet rs1=stmt.executeQuery(query);
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

