public class UppercaseAndLowercaseLetters {
    // 프로그래머스 : 대문자와 소문자
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (char c : my_string.toCharArray()){
            if (c > 64 && c <91){
                sb.append(String.valueOf(c).toLowerCase());
            } else if ( c > 96 && c <123){
                sb.append(String.valueOf(c).toUpperCase());
            }
        }
        return answer = sb.toString();
    }
}
