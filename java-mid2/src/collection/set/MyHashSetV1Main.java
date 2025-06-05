package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hashIndex 중복 - 9 번 인덱스에 [99, 9] 형태로 저장된다.
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue); //9있으니까 true겠지
        System.out.println("set.contains(" + searchValue + ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
