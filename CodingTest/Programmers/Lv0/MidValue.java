import java.util.Arrays;

public class MidValue {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        return answer = array[array.length/2];
    }
}
