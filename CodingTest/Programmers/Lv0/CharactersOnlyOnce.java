import java.util.*;
public class CharactersOnlyOnce {
    //프로그래머스 : 한 번만 등자한 문자
    public static String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String item : s.split("")){
            map.put(item , map.getOrDefault(item, 0)+1);
        }

       for ( Map.Entry<String,Integer> entry: map.entrySet()){
                if (entry.getValue() == 1){
                    list.add(entry.getKey());
                }
           }
        Collections.sort(list);
       for (String item : list){
           answer +=item;
       }
        return answer;
    }

    public static void main(String[] args) {
        String s = "abcd";

        solution(s);
    }
}
