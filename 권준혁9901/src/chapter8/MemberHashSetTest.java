package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		hashSet.addMember(new Member("����"));
		hashSet.addMember(new Member("����"));
		hashSet.addMember(new Member("���"));
		hashSet.addMember(new Member("���"));
		hashSet.addMember(new Member("���"));
		hashSet.addMember(new Member("����"));
		hashSet.addMember(new Member("��ĥ"));
		hashSet.addMember(new Member("����"));
		hashSet.addMember(new Member("�豸"));
		
		hashSet.showAllMember();
		
		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210008, "���");
		
		hashSet.showAllMember();
		
	}

}
