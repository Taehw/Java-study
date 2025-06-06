package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        //코드작성
        Set<Integer> set = new HashSet<>();
        for (Integer element : inputArr) {
            set.add(element);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
