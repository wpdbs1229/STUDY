public class Game369 {

    public static int solution(int order) {
        int answer = 0;

        char[] cArr = String.valueOf(order).toCharArray();

        for (char c : cArr){
            if ((c-'0') % 3 == 0 && (c-'0') != 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       System.out.println(solution(29423));

    }
}
