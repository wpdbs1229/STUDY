public class SharingPizza_2 {
    public int solution(int n) {
        int answer = n / getGcd(n,6) ;
        return answer;
    }
    public static int getGcd(int a, int b){
        if (b == 0){
            return a;
        }
        return getGcd(b , a%b);
    }
}
