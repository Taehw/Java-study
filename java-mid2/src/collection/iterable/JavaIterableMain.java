package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator()); //iterator = class java.util.ArrayList$Itr
        printAll(set.iterator()); //iterator = class java.util.HashMap$KeyIterator

        foreach(list); //iterable = class java.util.ArrayList
        foreach(set); //iterable = class java.util.HashSet

        //모두 1 2 3 나옴
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }

    }

    private static void printAll(Iterator<Integer> iterator) { //매개변수로 넘길때 Iterator<Integer> iterator = list.iterator가 이미 이루어짐
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
