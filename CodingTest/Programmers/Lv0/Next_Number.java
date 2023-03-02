public class Next_Number_Programmers_Lv0 {

    public static int solution(int[] common) {
        int answer = 0;



        if (common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length-1] + common[1] - common[0];
        } else {
            answer = common[common.length-1] * common[1] / common[0];
        }


        return answer;
    }

    public static void main(String[] args) {
        int arr1[] = { 1,2,3,4};
        int arr2[] = { 2,4,8};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));

    }
}
