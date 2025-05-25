package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; //배열의 기본 크기

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //지정한 용야랑으로 배열으 ㅣ크기 설정
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    //배열의 size를 리턴
    public int size() {
        return size;
    }


    //배열에 원소를 추가하고 size 늘린다
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    // 지정된 인덱스의 원소를 반환
    public Object get(int index) {
        return elementData[index];
    }

    //인덱스와 배열의 원소값을 받아서 예전값은 따로 저장해서 리턴하고 지정된 인덱스의 값을 교체
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //원소가 배열의 몇번째에 위치했는지를 반환
    //원소가 들어간 크기만큼만 돌면되서 size 보다 작은 i값을 활용하였음
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + " , capacity = " + elementData.length;
    }
    //copyOf : size의 크기만큼만 출력하고 싶어서 t사용
    /**
     * 실제 데이터 1 2 3 null null 이라면 (size = 3)
     * 사이즈 크기 만큼 카피후 1 2 3 만 출력
     */
}
