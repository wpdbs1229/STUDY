public class AddDigits {
    //프로그래머스 : 자릿수 더하기
    public static int solution(int n) {
        int answer = 0;
        answer += digit(n);
        return answer;
    }
    public static int digit(int n){
        if (n  <  10){
            return n;
        }
        return digit(n/10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
    }

}
