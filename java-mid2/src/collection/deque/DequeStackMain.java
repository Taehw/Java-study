package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque); //[3, 2, 1]

        //다음 꺼낼 데이터 확인(단순 조회)
        System.out.println("deque.peek() = " + deque.peek()); //deque.peek() = 3 - 후입선출

        System.out.println("pop = " + deque.pop()); //pop = 3
        System.out.println("pop = " + deque.pop()); //pop = 2
        System.out.println("pop = " + deque.pop()); //pop = 1
        System.out.println(deque); //[]
    }
}
