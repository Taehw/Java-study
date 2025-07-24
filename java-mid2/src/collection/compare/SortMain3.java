package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};

        System.out.println("기본데이터");
        System.out.println(Arrays.toString(array)); //[MyUser{id='a', age=30}, MyUser{id='a', age=20}, MyUser{id='a', age=10}]

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array); //오버라이딩된 compareTo 메서드를 통해 나이 기준 오름차순 정렬됨
        System.out.println(Arrays.toString(array)); //[MyUser{id='a', age=10}, MyUser{id='a', age=20}, MyUser{id='a', age=30}]

        //IdComparator를 위해 추가된 코드
        System.out.println("IdCompartor 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array)); //[MyUser{id='a', age=10}, MyUser{id='a', age=20}, MyUser{id='a', age=30}]

        System.out.println("IdCompartor().reversed() 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array)); //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
    }
}
