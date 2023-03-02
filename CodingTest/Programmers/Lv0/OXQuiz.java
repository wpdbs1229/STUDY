

public class OXQuiz {
    //프로그래머스 : OX 퀴즈
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int sum = Integer.parseInt(str[0]) + (str[1].equals("+") ? 1 : -1) * Integer.parseInt(str[2]);
            answer[i] = sum == Integer.parseInt(str[4]) ? "O" : "X";
        }
        for (int i = 0; i <answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr ={"3 - 4 = -3", "5 + 6 = 11"};
        solution(arr);
    }
}
