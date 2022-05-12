import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Service;

public class AddRecordServlet extends HttpServlet {
	private boolean isMentor =false;
	
	public void doPost (HttpServletRequest req, HttpServletResponse res) {
		
		
		String role = req.getParameter("role");
		//int memberId = Integer.parseInt(req.getParameter("cipsMemNo"));
		int memberId=1234; //Need to remove this later . Testing only
		String fullName = req.getParameter("fullName");
		String email = req.getParameter("email");
		String currentLocation = req.getParameter("currLoc");
		String regDate = req.getParameter("regDate");
		regDate = "2012-09-25"; // Need to remove this later
		String educationLevel = req.getParameter("educationLevel");
		String instituteName = req.getParameter("instituteName");
		String country = req.getParameter("country");
		String experience = req.getParameter("experience");
		String experienceType = req.getParameter("experienceType");
		String preference = req.getParameter("preference");
		String ranking = req.getParameter("ranking");
		
		PrintWriter out=null;
		Member m = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(role.equalsIgnoreCase("role_mentor")) {
			isMentor=true;
			String profession = req.getParameter("profession");
			String title = req.getParameter("title");
			m= new Mentor(memberId, fullName, email, currentLocation, regDate, educationLevel, educationLevel, instituteName, country, experience, experienceType, null, null, preference, ranking, profession, title);
		} else if (role.equalsIgnoreCase("role_mentee")) {
			isMentor=false;
			m= new Mentee(memberId, fullName, email, currentLocation, regDate, educationLevel, educationLevel, instituteName, country, experience, experienceType, null, null, preference, ranking);
		}	
		CipsDAO dao = new CipsDAO();
		dao.updateTables(m, isMentor);	
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
}
