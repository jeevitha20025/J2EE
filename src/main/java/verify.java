import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/verify")
public class verify extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("u_id"));
		String name=req.getParameter("u_name");
		String email=req.getParameter("u_email");
		long contact=Long.parseLong(req.getParameter("u_contact"));
		
		try {
			int result=insertData(id,name,email,contact);
			res.getWriter().print(result+"rows inserted");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			

	public int insertData(int id,String name,String email,long contact) throws ClassNotFoundException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","root");
	
	PreparedStatement pst=con.prepareStatement("insert into teacher values(?,?,?,?)");
	
	int a=pst.executeUpdate();
	con.close();
	
	res.getWriter().print(a+"rows inserted");
	}
	
	
	}

	private int insertData(int id, String name, String email, long contact) {
		// TODO Auto-generated method stub
		return 0;
	}
}
