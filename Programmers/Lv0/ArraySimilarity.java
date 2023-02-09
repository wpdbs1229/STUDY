public class ArraySimilarity {
    //프로그래머스 : 배열 유사도
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str1 : s1){
            for (String str2 : s2){
                if (str1.equals(str2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
