package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();

        member1.name = "학생1";
        member1.age = 15;
        member1.grade = 80;

        MemberInit member2 = new MemberInit();

        member2.name = "학생2";
        member2.age = 16;
        member2.grade = 90;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + " , 성적: " + s.grade);
        }

    }
}
