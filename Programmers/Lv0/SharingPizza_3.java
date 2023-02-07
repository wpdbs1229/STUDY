public class SharingPizza_3 {
    /*
    프로그래머스 : 피자나눠먹기(3)
    */
    public int solution(int slice, int n) {
        int answer = n / slice;

        if ( n % slice > 0){
            answer = n / slice + 1;
        }

        return answer;
    }
}
