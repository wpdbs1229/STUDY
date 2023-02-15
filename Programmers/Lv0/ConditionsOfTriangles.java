import java.util.Arrays;

public class ConditionsOfTriangles {
    //프로그래머스 : 삼각형의 완성조건(1)
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]){
            answer =1;
        }
        return answer;
    }
}
