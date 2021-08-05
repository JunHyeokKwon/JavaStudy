package chapter8;

import java.io.ObjectOutputStream.PutField;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, Member> tm;
	
	public MemberTreeMap() {
		tm = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member m) {
		tm.put(m.getMemberId(), m); // tm.put(key, value)
		
	}
	
	public boolean removeMember(int memberId) {
		if(tm.containsKey(memberId)) {
			System.out.println(tm.get(memberId));
			System.out.println();
			tm.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 HashSet에 존재하지 않습니다.");
		return false;
	}
	
	public boolean modifyMember(int memberId, String modifyMemberName) {
		if(tm.containsKey(memberId)) {
			String preName = tm.get(memberId).getMemberName();
			tm.get(memberId).setMemberName(modifyMemberName);
			System.out.println("<수정된 " + tm.get(memberId).getMemberId() + " Member정보>");
			System.out.println(preName + " -> " + tm.get(memberId).getMemberName());
			System.out.println();
			return true;
		}
		System.out.println(memberId + "가 HashSet에 존재하지 않습니다.");
		return false;
	}
	
	
	
	public void showAllMember() {
		Iterator<Integer> ir = tm.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member m = tm.get(key);
			System.out.println(m);
		}
		System.out.println();
	}
}
