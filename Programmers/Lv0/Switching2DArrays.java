public class Switching2DArrays {
    //프로그래머스 : 2차원 만들기
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5,6,7,8};
        solution(num_list,2);
    }
}
