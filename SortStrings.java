import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
    //프로그래머스 : 문자열 정렬하기(1)
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer.add(c-'0');
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
