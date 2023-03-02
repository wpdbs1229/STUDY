public class CompositeNumber {
    //프로그래머스 : 합성수 찾기
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++){
            int divisors = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0){
                    divisors++;
                }

            }
            if (divisors > 2){
                answer++;
            }
        }
        return answer;
    }
}
