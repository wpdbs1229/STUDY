import java.util.Stack;

public class StringCalculation {
    // 프로그래머스 : 문자열 계산하기
    public static  int solution(String my_string) {
        int answer = 0;
        int minus = 1;
        Stack<Integer> stack = new Stack<>();

        for (String s : my_string.split(" ")){
            if (s.equals("+")){
                continue;
            } else if (s.equals("-")) {
                minus *= -1;
            } else {
                int num = Integer.parseInt(s);
                if (minus < 0){
                    num *= -1;
                    minus = 1;
                }
                stack.add(num);
            }
        }

        while (!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }
}
