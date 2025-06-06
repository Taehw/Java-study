package collection.set.javaset;

import java.util.*; //util의 모든 라이브러리 import

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>()); //타입추론 덕에 <> 에 자료형 입력 안해도 됨 개꿀
        //A 1 B 2 C
        run(new LinkedHashSet<>());
        //C B A 1 2
        run(new TreeSet<>());
        //1 2 A B C
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        //set = class java.util.HashSet
        //set = class java.util.LinkedHashSet
        //set = class java.util.TreeSet

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
