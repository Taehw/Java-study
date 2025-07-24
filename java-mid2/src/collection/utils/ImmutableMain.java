package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        //가변리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list); //불변을 넣어 가변으로 바꿔주기
        mutableList.add(4); //컴파일에러 없음
        System.out.println("mutableList = " + mutableList); //mutableList = [1, 2, 3, 4]
        System.out.println("mutableList class = " + mutableList.getClass()); //mutableList class = class java.util.ArrayList

        //불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList Class = " + unmodifiableList.getClass()); //unmodifiableList Class = class java.util.Collections$UnmodifiableRandomAccessList

        //예외 발생 java.lang.UnSupportedOperationException
        //unmodifiableList.add(5);
    }
}
