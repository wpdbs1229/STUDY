import java.util.Arrays;
import java.util.stream.IntStream;

public class OddSorting {
    // 프로그래머스 : 홀수정렬

    public static int[] solution(int n) {
        int[] answer = IntStream.range(1,n+1).filter(x -> x % 2 ==1).toArray();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
