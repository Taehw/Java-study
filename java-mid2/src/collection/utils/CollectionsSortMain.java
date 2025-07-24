package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //max, min 연산모두 정렬후 가져옴
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max); //max = 5
        System.out.println("min = " + min); //min = 1

        System.out.println("list = " + list); //list = [1, 2, 3, 4, 5]
        Collections.shuffle(list); //랜덤으로 스까부림 -> 카드게임같은 프로그램에서 사용
        System.out.println("shufflelist = " + list); //shufflelist = [4, 2, 5, 1, 3]
        Collections.sort(list);
        System.out.println("sort list = " + list); //sort list = [1, 2, 3, 4, 5]
        Collections.reverse(list);
        System.out.println("reverse list = " + list); //reverse list = [5, 4, 3, 2, 1]
    }

}
