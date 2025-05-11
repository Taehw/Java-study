package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100); //개 생성
        Cat cat = new Cat("냐옹이", 100); // 고양이 새성

        AnimalMethod.checkup(dog); //generic 메서드 이용중인데 타입추론덕분에 메서드명 옆에 <Dog>, <Cat> 이 생략됨
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog); //targetDog 대신에 cat 넣어주면 컴파일오류 앞에 dog타입으로 넣어줘서 이미 타입이 정해지기 대문에
        //위의 코드도 타입추론덕에 다이아몬드 생략했당~
        System.out.println("bigger = " + bigger);
    }
}
