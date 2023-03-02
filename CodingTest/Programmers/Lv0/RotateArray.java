import java.util.Deque;
import java.util.LinkedList;

public class RotateArray {
    //프로그래머스 : 배열 회전시키기
    public Deque<Integer> solution(int[] numbers, String direction) {
        int[] answer = {};
        Deque<Integer> deque = new LinkedList<>();

        for (int num : numbers){
            deque.add(num);
        }

        if (direction.equals("right")){
            deque.addFirst(deque.removeLast());
        } else {
            deque.addLast(deque.removeFirst());
        }

        return deque;
    }
}
