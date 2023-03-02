public class Squared {
    /*
     * 프로그래머스 : 제곱근 판별하기
     */
    public int solution(int n) {
        int answer = 2;
        int c = (int)Math.sqrt(n);
        if ( c * c == n){
            answer = 1;
        }
        return answer;
    }
}
