import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {
    public static String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();

        for (String s : my_string.split("")){
            list.add(s);
        }

        Collections.reverse(list);

        //join을 통해 배열형태를 String 형태로 바꿀수 있음
        answer = String.join("",list);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }
}
