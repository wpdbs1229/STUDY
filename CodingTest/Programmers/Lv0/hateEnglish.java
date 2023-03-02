public class hateEnglish {
    // 프로그래머스 : 영어가 싫어요
    public static long solution(String numbers) {
        long answer = 0;
        String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i <numArr.length; i++) {
            numbers = numbers.replace(numArr[i], String.valueOf(i));
        }

        return answer = Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));
    }
}
