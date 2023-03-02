
import java.util.Arrays;

public class AboveStandard {
    // 프로그래머스 : 머쓱이 보다 키큰 사람
    public int solution(int[] array, int height) {
        int answer = (int) Arrays.stream(array).filter(x -> x > height).count();
        return answer;
    }
}
