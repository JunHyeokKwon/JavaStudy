package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		hashSet.addMember(new Member("±èÀÏ"));
		hashSet.addMember(new Member("±èÀÌ"));
		hashSet.addMember(new Member("±è»ï"));
		hashSet.addMember(new Member("±è»ç"));
		hashSet.addMember(new Member("±è¿À"));
		hashSet.addMember(new Member("±èÀ°"));
		hashSet.addMember(new Member("±èÄ¥"));
		hashSet.addMember(new Member("±èÆÈ"));
		hashSet.addMember(new Member("±è±¸"));
		
		hashSet.showAllMember();
		
		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210008, "±è½Ê");
		
		hashSet.showAllMember();
		
	}

}
