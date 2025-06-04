package collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        //입력: 1, 2, 5, 8
        //[null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10]; //크기도 당연히 들려줘야겠지 8까지 넣어야하니까
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; //O(1) - 배열의 index값으로 조회하니까 겁나 빨라짐
        System.out.println("result = " + result);
    }
}
