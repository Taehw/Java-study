package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에 추가되는 add 연산 //O(n) 노드이 참조를 순회
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //첫번재 항복에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d"); //O(1)
        System.out.println(list);

        System.out.println("첫 번재 항목 삭제");
        list.remove(0);
        System.out.println(list);


        //중간 항목에 추가, 삭제
        // prev를 찾거나 removeNode를 찾는데 O(n)
        System.out.println("중간 항목에 추가");
        list.add(1, "e"); //O(n)
        System.out.println(list);
        System.out.println("중간 항목에 삭제");
        list.remove(1); //remove O(n)
        System.out.println(list);
    }
}
