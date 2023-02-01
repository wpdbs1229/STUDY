import java.util.Arrays;

public class AverageOfArray {
    public double solution(int[] numbers) {
        double answer = 0;
        answer = Arrays.stream(numbers).average().getAsDouble();
        return answer;
    }
}
