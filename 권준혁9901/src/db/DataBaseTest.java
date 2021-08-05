package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * java <=> database(db) -> mySql(mysqlconnectionJ), mariadb, mssql, 오라클
 * JDBC
 *
 */
public class DataBaseTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection con = null; // Connection = MySql 연결
		Statement stmt = null; // Statement = DataBase에 Quer
		ResultSet rs = null; // ResultSet = set의 형태로 전환
		
		String id = null,
				pwd = null,
				name = null,
				phone = null;
				
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/swing", "root", "toor"); // Connection = MySql 연결
			stmt = con.createStatement(); // Statement = DataBase에 Query 실행
			rs = stmt.executeQuery("select user_id, user_pwd, user_name, user_phone from user_mst"); // ResultSet = set의 형태로 전환
			
			System.out.println("<user정보>");
			while(rs.next()) {
				id = rs.getString("user_id");
				pwd = rs.getString("user_pwd");
				name = rs.getString("user_name");
				phone = rs.getString("user_phone");
				
				System.out.println("id : " + id);
				System.out.println("pwd : " + pwd);
				System.out.println("name : " + name);
				System.out.println("phone : " + phone);
			}
		} catch(SQLException sqlEx)  {
			System.out.println(sqlEx);
		} catch(Exception ex)  {
			System.out.println(ex);
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}

	}

}
