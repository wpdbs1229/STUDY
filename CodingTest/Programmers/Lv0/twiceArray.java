import java.util.Arrays;

public class twiceArray {
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        answer = Arrays.stream(numbers).map(x->x*2).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3};
        System.out.println(solution(arr));
    }
}
