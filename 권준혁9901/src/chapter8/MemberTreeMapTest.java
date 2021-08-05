package chapter8;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("����"));
		tm.addMember(new Member("����"));
		tm.addMember(new Member("���"));
		tm.addMember(new Member("���"));
		tm.addMember(new Member("���"));
		tm.addMember(new Member("����"));
		tm.addMember(new Member("��ĥ"));
		tm.addMember(new Member("����"));
		tm.addMember(new Member("�豸"));
		
		tm.showAllMember();
		
		tm.removeMember(20210006);
		
		tm.showAllMember();
		
		tm.modifyMember(20210008, "���");
		
		tm.showAllMember();
	}
}
