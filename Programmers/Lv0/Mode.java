import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mode {
    // 프로그래머스 : 최빈값 구하기
    public static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // map 넣어서 key, 빈도수 구하기
        for (int n : array){
            map.put(n, map.getOrDefault(n,0)+1);
        }


        // 최대 빈도수 max에 넣기
        Integer max = map.entrySet().stream().max(
                (entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1: -1
        ).get().getValue();

        // 최대 빈도수를 가지는 값을 list에 넣기
        List list = map.entrySet().stream().filter(
                entry-> entry.getValue() == max
        ).map(
                Map.Entry<Integer,Integer>::getKey
        ).collect(Collectors.toList());


        //list 크기가 1이 아니면 같은 최대빈도수를 가지는 값이 2개이상이므로 -1
        if (list.size() != 1){
            answer = -1;
        } else {
            answer = (int) list.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        System.out.println(solution(arr1));
    }
}
