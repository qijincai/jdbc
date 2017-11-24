package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class adddemo1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///mydb1",
					"root", "root");
			stat = conn.createStatement();
			String sql = "insert into account value(null,'张飞',888)";
			int rows = stat.executeUpdate(sql);
			System.out.println("影响了"+rows+"行");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					rs=null;
				}
			}
			if(stat!=null){
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					stat=null;
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					conn=null;
				}
			}
		}
		
	}
}






