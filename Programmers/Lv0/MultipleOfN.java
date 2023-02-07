import java.util.ArrayList;

public class MultipleOfN {
    //프로그래머스 : n의 배수
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : numlist){
            if (num % n == 0){
                answer.add(num);
            }
        }
        return answer;
    }
}
