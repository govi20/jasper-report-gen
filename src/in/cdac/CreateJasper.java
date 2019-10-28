package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import net.sf.jasperreports.engine.JasperCompileManager;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:10-Aug-2015
 */
public class CreateJasper
{
	public static void main( String[] args )
	{
		try
		{
			HashMap<String, Object> map = new HashMap<String, Object>(1);
			map.put("APPLICANT_ID", "G661F87");
			/*	Connection con = CreateJasper.getConnection();
			JasperFillManager.fillReport("/home/govi/Desktop/Application_Form.jasper",map,con);*/
		
			Connection con = CreateJasper.getConnection();
			System.out.println("Compiling report...");
			
		   JasperCompileManager.compileReportToFile("/home/govi/Desktop/jasper/Admit_Card_Afternoon.jrxml","/home/govi/Desktop/jasper/Admit_Card_Afternoon.jasper");
		    System.out.println("Filling report...");
		//    JasperFillManager.fillReport(jasperReport,map, con);
		    System.out.println("Done!");
		
		}
		catch (Exception e)
		{	
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		Connection con = null;
			try
			{
				Class.forName("org.postgresql.Driver");
				
				// TODO::SQLITE File path
				con = DriverManager.getConnection("jdbc:postgresql://1.1.1.1:5433/gate", "1", "1");
				con.setAutoCommit(true);
			
				// TODO::println("Opened database successfully");
				System.out.println("Opened database successfully");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return con;
		
	}
}
