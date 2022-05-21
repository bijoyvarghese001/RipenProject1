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
		System.out.println("role = "+role);
		String memberNo = req.getParameter("memNumber");
		System.out.println("memberNo = "+memberNo);
		int memberId = Integer.parseInt(req.getParameter("memNumber"));
		String fullName = req.getParameter("fullName");
		System.out.println("fullName = "+fullName);
		String email = req.getParameter("email");
		System.out.println("email = "+email);
		String currentLocation = req.getParameter("currLoc");
		System.out.println("currentLocation = "+currentLocation);
		String regDate = req.getParameter("regDate");
		System.out.println("regDate = "+regDate);
		regDate = "2012-09-25"; // Need to remove this later
		String educationLevel = req.getParameter("education");
		System.out.println("educationLevel = "+educationLevel);
		String instituteName = req.getParameter("institution");
		System.out.println("instituteName = "+instituteName);
		String country = req.getParameter("country");
		System.out.println("country = "+country);
		String experience = req.getParameter("experience");
		System.out.println("experience = "+experience);
		String experienceType = req.getParameter("experienceType");
		System.out.println("experienceType = "+experienceType);
		String preference = req.getParameter("individualpreference");
		System.out.println("preference = "+preference);
		String ranking = req.getParameter("ranking");
		System.out.println("ranking = "+ranking);
		
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
