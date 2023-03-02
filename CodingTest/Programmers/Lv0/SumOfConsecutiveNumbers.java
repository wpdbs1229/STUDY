import java.util.ArrayList;

public class SumOfConsecutiveNumbers {
    public static ArrayList<Integer> solution(int num, int total) {
        ArrayList<Integer> answer = new ArrayList<>();

        int x = total/num;
        int y = x + num/2;

        for (int i = num-1; i >=0; i--) {
            answer.add(y-i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 15));
    }
}
