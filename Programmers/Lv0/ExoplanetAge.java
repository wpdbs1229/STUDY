public class ExoplanetAge {
    //프로그래머스 : 외계행성 나이
    public static String solution(int age) {
        String str = String.valueOf(age);
        String answer = "";
        for (char c : str.toCharArray()){
            char newc = (char) (c + '0'+ 1);
            answer +=newc;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}
