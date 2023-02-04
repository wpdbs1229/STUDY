
import java.util.Arrays;


public class SortString {

    public static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] cArr = my_string.toCharArray();

        Arrays.sort(cArr);

        return answer = new String(cArr);
    }

    public static void main(String[] args) {
        String st = "Bcad";

        System.out.println(solution(st));
    }
}
