package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memeberA = new MemberV1("회원A", address);
        MemberV1 memeberB = new MemberV1("회원B", address);

        //회원A, 회원B의 처음주소는 모두 서울
        System.out.println("memeberA = " + memeberA);
        System.out.println("memeberB = " + memeberB);

        //회원 B의 주소를 부산으로 변경
        memeberB.getAddress().setValue("부산");
        System.out.println("부산 --> memberB.address");
        System.out.println("memeberA = " + memeberA);
        System.out.println("memeberB = " + memeberB);

    }
}
