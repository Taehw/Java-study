package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16; //기본 용량이 너무 작으면 해시충돌 많아지니 적절히 설정

    LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    //디폴트 용량으로 생성
    public MyHashSetV3() {
        initBuckets();
    }

    //용량을 내가 지정
    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    //생성자에서 반복적으로 사용되는 부분이라 메서드 추출로 따로 만들어줬다
    //buckets안의 각 요소를 연결리스트로 초기화 해주는 부분 -> [[],[],[],[]........,[],[]]
    private void initBuckets() {

        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    //이미 해왔던 것들
    public boolean add(E value) {
        int hashIndex = hashIndex(value); //해시인덱스부터 구하기
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;

        return true;
    }


    public boolean contains(E searchValue){
        int hashIndex = hashIndex(searchValue); //여기도 해시인덱스부터 구하고
        LinkedList<E> bucket = buckets[hashIndex]; //해시인덱스의 바구니를 찾음
        return bucket.contains(searchValue); //바구니안에 찾는값이 있는지 검사, 연결리스트이기때문에 기본 기능으로 contains를 사용한다.
    }

    //v0에서는 remove는 구현하지 않았다.
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];

        boolean result = bucket.remove(value);

        if (result) { //바구니 안에 삭제하려는 요소가 존재했다으면 삭제 ㄱㄱ
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}