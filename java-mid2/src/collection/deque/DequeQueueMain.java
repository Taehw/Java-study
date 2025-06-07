package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque); //[1, 2, 3]

        //다음 꺼낼 데이터 확인(단순조회)
        System.out.println("deque.peek() = " + deque.peek()); //deque.peek() = 1

        //데이터 꺼내기(선입선출)
        System.out.println("poll = " + deque.poll()); // poll = 1
        System.out.println("poll = " + deque.poll()); // poll = 2
        System.out.println("poll = " + deque.poll()); // poll = 3
        System.out.println(deque); // []
    }
}
