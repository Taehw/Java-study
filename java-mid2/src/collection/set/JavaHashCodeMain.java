package collection.set;

import collection.set.member.Member;

import java.sql.SQLOutput;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode()); //obj1.hashCode() = 189568618
        System.out.println("obj2.hashCode() = " + obj2.hashCode()); //obj2.hashCode() = 664223387

        //각 클래스마다 hashCode를 이미 오버라이스딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("'10'.hashCode() = " + i.hashCode()); //'10'.hashCode() = 10
        System.out.println("'A'.hashCode() = " + strA.hashCode()); //'A'.hashCode() = 65
        System.out.println("'AB'.hashCode() = " + strAB.hashCode()); //'AB'.hashCode() = 2081

        //hashCode는 마이너스 값이 들어올수 있다.
        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode()); //-1.hashCode = -1

        //둘은 같을까 다를까?. 인스턴스는 다르지만, equals는 같다. (동일성 동등성)
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        //물리적으로 다르지만 논리적으로 같음

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2)); //(member1 == member2) = false
        System.out.println("member1.equals(member2) = " + member1.equals(member2)); //member1.equals(member2) = true
        System.out.println("member1.hashCode() = " + member1.hashCode()); //member1.hashCode() = 104101
        System.out.println("member2.hashCode() = " + member2.hashCode()); //member2.hashCode() = 104101

    }
}
