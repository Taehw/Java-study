package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        //코드 작성
        String[] fruit = fruits.split(",");
        for (String string : fruit) {
            System.out.println(string);
        }

        //합치기
        String joinedFruits = String.join("->", fruit);
        System.out.println(joinedFruits);
    }
}
