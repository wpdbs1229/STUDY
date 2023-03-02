import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {

    public int[] solution(int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> list  = new ArrayList<>();
        for (int n : num_list){
            list.add(n);
        }

        Collections.reverse(list);

        return answer = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
