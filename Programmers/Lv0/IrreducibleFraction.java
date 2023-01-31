import java.util.stream.IntStream;

public class IrreducibleFraction {

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int[] answer = new int[2];

       int denom = denom1 * denom2;
       int numer = numer1 * denom2 + numer2 * denom1;

       int gcd = getGcd(denom,numer);
       answer[0] = numer/ gcd;
       answer[1] = denom /gcd;
       return answer;
    }

    public static int getGcd(int x, int y){
        int r = x % y;
        if ( r == 0){
            return y;
        }
        return getGcd(y , r);
    }

    public static void main(String[] args) {
        solution(1,2,3,4);
        System.out.println(getGcd(3,4));
    }

}
