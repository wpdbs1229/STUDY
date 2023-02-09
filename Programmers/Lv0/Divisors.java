import java.util.ArrayList;
import java.util.Collections;

public class Divisors {
    //프로그래머스 : 약수 구하기 n의 제곱근까지 구하기 돌려서 나눈수 넣기
    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n % i == 0){
                answer.add(i);
                if ( i != n/i){
                    answer.add(n/i);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(100);
    }
}
