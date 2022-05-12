import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class CipsDAO {
	Connection conn;

	public Connection getConnection(boolean isMentor) {
		Connection conn = null;
		String connectionURL;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Here we should provide the actual database name, username and password
			if (isMentor) {
				connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Mentor;" + "User=EmpDBApps;Password=java1"
						+ ";encrypt=true;trustServerCertificate=true";
			} else {
				connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Mentee;" + "User=EmpDBApps;Password=java1"
						+ ";encrypt=true;trustServerCertificate=true";
			}

			conn = DriverManager.getConnection(connectionURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void updateTables(Member m, boolean isMentor) {
		conn = getConnection(isMentor);
		updatePersonalInfo(m);
		updateEducationalInfo(m);
	}

	private void updatePersonalInfo(Member m) {
		// provide the table name
		String sql = null;
		if (m instanceof Mentor) {
			Mentor mentor = (Mentor) m;
			sql = "INSERT INTO PersonalInfo values(" + mentor.getMemberId() + ",'" + mentor.getFullName() + "','"
					+ mentor.getEmail() + "','" + mentor.getCurrentLocation() + "','" + mentor.getProfession() + "','"
					+ mentor.getTitle() + "','" + mentor.getRegDate() + "')";
		} else if (m instanceof Mentee) {
			sql = "INSERT INTO PersonalInfo values(" + m.getMemberId() + ",'" + m.getFullName() + "','" + m.getEmail()
					+ "','" + m.getCurrentLocation() + "','" + m.getRegDate() + "')";
		}
		updateTable(sql);
	}

	private void updateEducationalInfo(Member m) {
		// provide the table name
		String sql = "INSERT INTO EducationalInfo values(" + m.getMemberId() + ",'" + m.getEducationLevel() + "','"
				+ m.getEducationField() + "','" + m.getInstituteName() + "','" + m.getCountry() + "')";
		updateTable(sql);
	}

	private void updateTable(String sql) {

		try {
			Statement stmt = conn.createStatement();
			System.out.println("SQL = " + sql);
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
