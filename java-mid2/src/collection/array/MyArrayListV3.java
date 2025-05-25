package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5; //배열의 기본 크기

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //지정한 용야랑으로 배열으 ㅣ크기 설정
    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    //배열의 size를 리턴
    public int size() {
        return size;
    }


    //배열에 원소를 추가하고 size 늘린다
    public void add(Object e) {

        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //원하는 위치에 코드 추가
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index); //기존 원소들을 밀고
        elementData[index] = e; //새로운 원소를 원하는 index위치에 추가
        size++;
    }

    //코드 추가 , 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
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

    //코드 추가
    //데이터 삭제
    public Object remove(int index) {
        Object oldValue = get(index); //삭제된 위치의 값은 따로 저장해주고
        shiftLeftFrom(index); //index 위치 오른쪽 원소들을 왼쪽으로 이동해서 채워줘야지

        size--; //삭제햇으니까 size가 줄어들겠지?
        elementData[size] = null; //마지막에는 null을 채워주기 - 원소값들은 복사후 대입 방식으로 왼쪽으로 밀리기때문에 이게 없으면 abcc가 될수도 있음 c가 null이 되어야한다~
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
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
