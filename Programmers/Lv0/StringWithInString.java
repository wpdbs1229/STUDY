public class StringWithInString {
    //프로그래머스 : 문자열 안에 문자열
    public int solution(String str1, String str2) {
        int answer = 2;

        if (str1.contains(str2)){
            answer =1;
        }
        return answer;
    }
}
