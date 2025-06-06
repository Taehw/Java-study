package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2_MySol {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        //코드작성
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer element : inputArr) {
            set.add(element);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
