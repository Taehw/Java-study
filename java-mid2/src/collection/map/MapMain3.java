package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap); //{studentA=90}

        //학생이 없는 경우에만 추가 - 1번 방법
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100); //key가 존재하므로 추가되지 않는다.
        }
        System.out.println(studentMap);


        //학생이 없는 경우에만 추가 - 2번 방법
        studentMap.putIfAbsent("studentA", 100); //실행x -> key값이 이미 존재
        studentMap.putIfAbsent("studentB", 100); //실행O -> key값이 존재하지 않았음

        System.out.println(studentMap);
    }
}
