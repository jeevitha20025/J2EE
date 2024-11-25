import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class Add {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
		
		int sum=a+b;
		
		req.setAttribute("sum", sum);
		req.getRequestDispatcher("add.jsp").forward(req, res);
		
	}
}
