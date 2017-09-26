import java.sql.Connection;
import java.sql.SQLException;


public class ConnectDB {
	public static Connection Connect() throws ClassNotFoundException, SQLException {
		Connection conn;
		String userName = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/managestudent";
		Class.forName("com.mysql.jdbc.Driver");
		conn = java.sql.DriverManager.getConnection(url,userName,password);
		
		return conn;
	}
	
	public static void main(String[] args) {
		
		try {
			Connection conn = Connect();
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
