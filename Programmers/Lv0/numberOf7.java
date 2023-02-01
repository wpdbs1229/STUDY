import java.util.Arrays;

public class numberOf7 {
    public static int solution(int[] array) {
        int answer = 0;
        int checkSeven = 0;

        for (int num : array) {

            while (num != 0){

                checkSeven = num % 10;

                if (checkSeven % 7 == 0 && checkSeven % 10 != 0){
                    answer++;
                }
                num = num / 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr= {10,17};
        System.out.println(solution(arr));
    }
}
