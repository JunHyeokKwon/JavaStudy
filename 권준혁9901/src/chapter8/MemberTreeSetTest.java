package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		treeSet.addMember(new Member("����"));
		treeSet.addMember(new Member("����"));
		treeSet.addMember(new Member("���"));
		treeSet.addMember(new Member("���"));
		treeSet.addMember(new Member("���"));
		treeSet.addMember(new Member("����"));
		treeSet.addMember(new Member("��ĥ"));
		treeSet.addMember(new Member("����"));
		treeSet.addMember(new Member("�豸"));
		
		//treeSet.showAllMember();
		
		treeSet.removeMember(20210006);
		
		treeSet.showAllMember();
		
		treeSet.modifyMember(20210008, "���");
		
		treeSet.showAllMember();
		
		
	}

}
