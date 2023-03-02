public class ThrowingBall {
    // 프로그래머스 : 공던지기
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 1;

        for (int i = 0; cnt <=k; i +=2) {
            if (cnt == k) {
                answer = numbers[i % numbers.length];
                break;
            }
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        solution(numbers,2);
    }
}
