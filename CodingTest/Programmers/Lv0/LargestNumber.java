import java.util.HashMap;

public class LargestNumber {

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        HashMap<Integer,Integer> map = new HashMap();

        for (int i = 0; i <array.length; i++) {
            map.put(i,array[i]);
        }

        int maxKey = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        answer[0] = map.get(maxKey);
        answer[1] = maxKey;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,3};
        System.out.println(solution(arr));
    }
}
