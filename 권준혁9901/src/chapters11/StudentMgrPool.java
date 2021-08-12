package chapters11;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBConnectionMgr;

public class StudentMgrPool {
	DBConnectionMgr pool;
	
	public StudentMgrPool() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean insertStudent(StudentBean studentBean) {
		Connection con = null;
		PreparedStatement psmtm = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "insert into student_mst values(?, ?, ?, ?, ?)";
			psmtm = con.prepareStatement(sql);
			psmtm.setInt(1, studentBean.getYear());
			psmtm.setInt(2, studentBean.getGroup());
			psmtm.setInt(3, studentBean.getNum());
			psmtm.setString(4, studentBean.getScname());
			psmtm.setString(5, studentBean.getStname());
			psmtm.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
	
	
}
