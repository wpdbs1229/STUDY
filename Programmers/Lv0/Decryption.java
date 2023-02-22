public class Decryption {
    public String solution(String cipher, int code) {
        //프로그래머스 : 암호해독
        String answer = "";
        int j = 2;
        for (int i = 1;  j  < cipher.length(); i++ ) {
            j = code * i - 1;
            answer += cipher.charAt(j);
            j = code * (i+1) - 1;
        }
        return answer;
    }
}
