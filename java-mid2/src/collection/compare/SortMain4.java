package collection.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본데이터");
        System.out.println(list); //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]


        System.out.println("Comparable 기본정렬");
        list.sort(null);
        //Collections.sort(list);
        System.out.println(list); //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        //Collections.sort(list, new IdComparator());
        System.out.println(list); //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
    }
}
