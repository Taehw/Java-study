package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque); //[1]
        deque.offerFirst(2);
        System.out.println(deque); //[2, 1]
        deque.offerLast(3);
        System.out.println(deque); //[2, 1, 3]
        deque.offerLast(4);
        System.out.println(deque); //[2, 1, 3, 4]

        //다음 꺼낼때 확인(꺼내지 않고 단순 조회)
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // deque.peekFirst() = 2
        System.out.println("deque.peekLast() = " + deque.peekLast()); // deque.peekLast() = 4
        System.out.println("deque.peek() = " + deque.peek());

        //데이터 꺼내기
        System.out.println("pollFirst = " + deque.pollFirst()); //pollFirst = 2
        System.out.println("pollFirst = " + deque.pollFirst()); //pollFirst = 1
        System.out.println("pollLast = " + deque.pollLast()); //pollLast = 4
        System.out.println("pollLast =" + deque.pollLast()); //pollLast =3
    }
}
