public class Factorial {
    //프로그래머스 : 팩토리얼
    public static int solution(int n) {
        int answer = 1;
        int result = 1;

        while (result <= n){
            result *=answer++;
        }
        return answer-2;
    }

    public static void main(String[] args) {
        solution(7);
    }
}
