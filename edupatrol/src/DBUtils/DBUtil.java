package DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/**
	 * ִ�в�ѯ����
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet query(String sql) throws SQLException {
		Connection connection = ConUtil.getConn();
		Statement statement;
		if (connection != null) {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			return rs;
		}
		return null;
	}

	/**
	 * �����ݿ�����޸�
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static int update(String sql) throws SQLException {
		Connection connection = ConUtil.getConn();
		Statement statement;
		if (connection != null) {
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			return result;
		}
		return 0;
	}
}
