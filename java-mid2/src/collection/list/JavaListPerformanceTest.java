package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용

        addLast(arrayList, size);

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);

        LinkedList<Integer> LinkedList = new LinkedList<>(); //조회용 데이터로 사용

        addLast(LinkedList, size);

        int loop = 10_000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size /2);
        getIndex(arrayList, loop, size -1);

        System.out.println("==MyLinkedList 조회==");
        getIndex(LinkedList, loop, 0);
        getIndex(LinkedList, loop, size / 2);
        getIndex(LinkedList, loop, size - 1);

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("==MyLinkedList 검색==");
        search(LinkedList, loop, 0);
        search(LinkedList, loop, size / 2);
        search(LinkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) +"ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size ; i++){
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) +"ms");

    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size ; i++){
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) +"ms");

    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < loop ; i++){
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < loop ; i++){
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
