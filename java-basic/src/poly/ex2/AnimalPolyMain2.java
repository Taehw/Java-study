package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw};

//        for (int i = 0; i < animals.length; i++) {
//            soundAnimal(animals[i]);
//        }

        for (Animal animal : animals) {
            //soundAnimal(animal);
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }


    }
//
//    private static void soundAnimal(Animal animal) {
//        System.out.println("동물 소리 테스트 시작");
//        animal.sound();
//        System.out.println("동물 소리 테스트 종료");
//    }
}
