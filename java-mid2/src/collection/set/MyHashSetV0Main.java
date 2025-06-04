package collection.set;

public class MyHashSetV0Main {

    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        boolean result = set.add(4);//중복데이터 저장 -> 저장 안됌
        System.out.println("중복데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); //포함되어있으니까 true
        System.out.println("set.contains(99) = " + set.contains(99)); //당연히 false
    }
}
