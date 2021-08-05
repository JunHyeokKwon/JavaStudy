package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		treeSet.addMember(new Member("±èÀÏ"));
		treeSet.addMember(new Member("±èÀÌ"));
		treeSet.addMember(new Member("±è»ï"));
		treeSet.addMember(new Member("±è»ç"));
		treeSet.addMember(new Member("±è¿À"));
		treeSet.addMember(new Member("±èÀ°"));
		treeSet.addMember(new Member("±èÄ¥"));
		treeSet.addMember(new Member("±èÆÈ"));
		treeSet.addMember(new Member("±è±¸"));
		
		//treeSet.showAllMember();
		
		treeSet.removeMember(20210006);
		
		treeSet.showAllMember();
		
		treeSet.modifyMember(20210008, "±è½Ê");
		
		treeSet.showAllMember();
		
		
	}

}
