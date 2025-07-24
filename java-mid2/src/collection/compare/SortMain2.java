package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array)); //[3, 2, 1]

        System.out.println("Comparator 비교");

        //나만의 비교자1 - 오름차순 정렬
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator : " + Arrays.toString(array)); //AscComparator : [1, 2, 3]

        //나만의 비교자2 - 내림차순정렬
        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator : " + Arrays.toString(array)); //DescComparator : [3, 2, 1]

        //또다른 내림차순 방법
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator.reversed : " + Arrays.toString(array)); //AscComparator.reversed : [3, 2, 1]

    }

    //중첩클래스로 생성해서 나만의 오름차순 비교자 만들기
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 =" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2 ? 0 : 1)); //첫번재 값을 기준으로 양수 or 0 or 음수를 반환
        }
    }

    //중첩클래스로 생성해서 나만의 내림 차순 비교자 만들기
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 =" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2 ? 0 : 1)) * -1; //-1을 곱하므로 결과가 반대로 나옴 AESC-> DESC
        }
    }
}
