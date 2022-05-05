import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Service;

public class AddRecordServlet extends HttpServlet {
	
	public void doPost (HttpServletRequest req, HttpServletResponse res) {
		
		String role = req.getParameter("role");
		String name = req.getParameter("name");
		String membershipNo = req.getParameter("membership_no");
		String location = req.getParameter("location");
		String email = req.getParameter("email");
		
		PrintWriter out=null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("name = "+name);
		out.print("\nmembership_no = "+membershipNo);
		out.print("\nlocation = "+location);
		out.print("\nemail = "+email);
		out.print("\nrole = "+role);
		
		Mentor m = new Mentor(role, name, membershipNo, location, email);
		CipsDAO dao = new CipsDAO();
		dao.updateRecord(m);
		
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
}
