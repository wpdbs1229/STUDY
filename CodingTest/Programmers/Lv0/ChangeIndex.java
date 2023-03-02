public class ChangeIndex {
    //프로그래머스 : 인덱스 바꾸기
    public static String solution(String my_string, int num1, int num2) {
        char[] my_char = my_string.toCharArray();
        String answer = "";

        my_char[num1] = my_string.charAt(num2);
        my_char[num2] = my_string.charAt(num1);
        return answer = String.valueOf(my_char);
    }

    public static void main(String[] args) {
        solution("hello", 1,2);
    }
}
