import java.util.ArrayList;

public class StringSubString {
    public static String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        int idx = 0;

        while (idx + n < my_str.length()){
            answer.add(my_str.substring(idx, idx += n )) ;
        }
        answer.add(my_str.substring(idx,my_str.length()));
        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String str = "abc1Addfggg4556b";
        System.out.println(solution(str,6));
    }
}
