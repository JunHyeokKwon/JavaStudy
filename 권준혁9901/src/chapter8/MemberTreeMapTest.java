package chapter8;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("±èÀÏ"));
		tm.addMember(new Member("±èÀÌ"));
		tm.addMember(new Member("±è»ï"));
		tm.addMember(new Member("±è»ç"));
		tm.addMember(new Member("±è¿À"));
		tm.addMember(new Member("±èÀ°"));
		tm.addMember(new Member("±èÄ¥"));
		tm.addMember(new Member("±èÆÈ"));
		tm.addMember(new Member("±è±¸"));
		
		tm.showAllMember();
		
		tm.removeMember(20210006);
		
		tm.showAllMember();
		
		tm.modifyMember(20210008, "±è½Ê");
		
		tm.showAllMember();
	}
}
