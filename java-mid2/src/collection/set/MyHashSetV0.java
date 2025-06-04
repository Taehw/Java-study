package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) {
            //값이 이미 배열안에 존재한다면
            return false;
        }
        elementData[size] = value;
        size++;

        return true;
    }

    //O(n) - 중복검사
    public boolean contains(int value) {

        //배열을 순회하면서
        for (int data : elementData) {
            if(data == value) {//배열안에 넣으려는 value값과 같은 값이 있는지 검사한다.
                return true;
            }

        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + // null 안나오게 사이즈 만큼만 출력
                ", size=" + size +
                '}';
    }
}
