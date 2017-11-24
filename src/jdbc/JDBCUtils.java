package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils {
	public static void close(Connection conn,Statement stat,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				rs = null;
			}
		}
		if(stat!=null){
			try {
				stat.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				stat = null;
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				conn = null;
			}
		}
	}
}
