public class RepeatCharacter {
    /*
    * 프로그래머스 : 문자반복 출력하기
    */
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        for (String s : my_string.split("")){
            for (int i = 0; i <n ; i++) {
                sb.append(s);
            }
        }
        return answer = sb.toString();
    }
}
