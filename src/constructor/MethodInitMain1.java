package constructor;

/*
생성자가 없을 때
 */
public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "uer1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "uer2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + ", 나이 : " + m.age
                    + ", 성적 : " + m.grade);
        }
    }
}
