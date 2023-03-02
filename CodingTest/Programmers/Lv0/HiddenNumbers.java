public class HiddenNumbers {
    //프로그래머스 : 숨어있는 숫자의 덧셈(1)
    public int solution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer += Integer.parseInt(String.valueOf(c));
            }
        }
        return answer;
    }
}
