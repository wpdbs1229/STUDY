import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class ProcedureOfTreatment {

    public static ArrayList<Integer> solution(int[] emergency) {
        ArrayList<Integer> answer = new ArrayList<>();
        int EqualNumber = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer[] tmp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        for (int item : tmp){
            map.put(item, EqualNumber++ );
        }

        for (int item : emergency ){
            answer.add(map.get(item));
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        solution(emergency);
    }
}
