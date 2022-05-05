import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class CipsDAO {
	
	public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Here we should provide the actual database name, username and password
            String connectionURL = "jdbc:sqlserver://localhost:1433;DatabaseName=EmployessDB;"
                    + "User=EmpDBApps;Password=java1"+";encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(connectionURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
	
	public void updateRecord(Mentor m) {
        Connection conn = getConnection();
        
        try {
            Statement stmt =  conn.createStatement();
            // provide the table name
            String sql ="INSERT INTO Mentor values('"+m.getRole()+"','"+m.getName()+"','"+m.getMembershipNo()+"','"+m.getLocation()+"','"+m.getEmail()+"')";

            System.out.println("SQL = "+sql);
             stmt.executeUpdate(sql);                 
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
