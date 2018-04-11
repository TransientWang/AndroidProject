package DBUtils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConUtil {
	public final static String url = "jdbc:mysql://localhost:3306/����Ѳ�����ݿ�?user=root&password=root&useUnicode=true&characterEncoding=utf8";
			
	//public final static String name = "root";
	//public final static String password = "root";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {  
			e.printStackTrace();
		}
	}

	/**
	 * �����ݿ⽨������
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConn() throws SQLException {
		return DriverManager.getConnection(url);
	}

	/**
	 * �ر�����
	 * @param connection
	 * @param statement
	 * @param resultSet
	 * @throws SQLException
	 */
	public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
		if (connection != null) {
			connection.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
	}
}
