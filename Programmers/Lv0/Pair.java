public class Pair {
    // 프로그래머스 : 순서쌍의 갯수
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <n+1; i++) {
            if (n % i==0){
                answer++;
            }
        }
        return answer;
    }
}
