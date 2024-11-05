package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(2);
        dq.offerFirst(3);
        dq.offerLast(4);

        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.peek() );
    }
}
