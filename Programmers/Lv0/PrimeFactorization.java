import java.util.ArrayList;

public class PrimeFactorization {
    //프로그래머스 : 소인수분해
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            if (n % i == 0){
                while (n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }

        return list;
    }
}
