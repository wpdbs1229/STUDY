import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.math.BigInteger;

public class DividingMarbles {
    // 프로그래머스 : 구슬을 나누는 경우의 수
    /*
    * Int, Long을 해보았으나, 30 15로 테스트 했을 때 -가 나오는 현상을 발견,
    * 자료형이 표현할 수 있는 크기가 작아 -로 나온다.
    * BigInteger형 사용, 문자열 형태로 만들어져 숫자 범위에 제한 없음*/
    public static int solution(int balls, int share) {

        BigInteger answer = Factorial(balls).divide(Factorial(balls-share)).divide(Factorial(share));
        return answer.intValue();
    }

    public static BigInteger Factorial(int n){
        BigInteger fac = BigInteger.ONE;

        for (int i = 2; i <=n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        return fac;
    }

    public static void main(String[] args) {
        solution(30,15);
    }
}
