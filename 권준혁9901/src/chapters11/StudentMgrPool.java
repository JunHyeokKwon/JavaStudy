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
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
	
	
}
