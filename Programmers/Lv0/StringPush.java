import java.util.Deque;
import java.util.LinkedList;


public class StringPush {

    public static int solution(String A, String B) {


        Deque<String> dequeA = new LinkedList<>();
        Deque<String> dequeB = new LinkedList<>();

        // 덱에 각 문자열 넣기
        for (String s : A.split("")){
            dequeA.add(s);
        }
        for (String s : B.split("")){
            dequeB.add(s);
        }

        // 맨뒤에서 빼서, 맨앞에 추가하기 같은지 확인하여 같으면 i반환
        for (int i = 0; i <A.length(); i++) {
            if (dequeA.equals(dequeB)){
                return i;
            } else {
                dequeA.addFirst(dequeA.removeLast());
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(solution("hello", "ohell"));
    }
}
