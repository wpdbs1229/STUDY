public class FindNumber {
    // 프로그래머스 : 숫자 찾기
    public static int solution(int num, int k) {
        int answer = -1;
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        for (int i = 0; i <numStr.length(); i++) {
            if ( numStr.charAt(i) == kStr.charAt(0)){
                answer = i +1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(29183,1);
    }
}
