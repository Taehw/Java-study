package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap); //{studentA=90}

        studentMap.put("studentA", 100); //같은 키에 저장시 기존 값 교체된다.
        System.out.println(studentMap); //{studentA=100}

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey); //containsKey = true

        //특정학생의 값 삭제
        studentMap.remove("studentA"); //-> Entry가 통으로 날라감
        System.out.println(studentMap); //{}

    }
}
