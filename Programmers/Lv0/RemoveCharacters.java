public class RemoveCharacters {
    // 프로그래머스 : 특정문자 제거하기
    public String solution(String my_string, String letter) {
        String answer = "";
        my_string = my_string.replace(letter,"");
        return answer += my_string;
    }
}
