import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class LambSkewers {

    public int solution(int n, int k) {
        int answer = n  * 12_000;

        int m = n/10;

        if (k > m){
            k -=m;
        } else {
            k = 0;
        }

        answer += k* 2000;
        return answer;
    }
}
