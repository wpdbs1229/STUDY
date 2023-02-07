import java.util.ArrayList;


public class Babbling {
    /*
     * 프로그래머스 : 옹알이
     */
    public static int solution(String[] babbling) {
        int answer = 0;
        boolean flag = true;
        String[] rightBabbling = {"aya","ye", "woo", "ma"};
        ArrayList<String> list = new ArrayList<>();
         for (String s : babbling){
            for (String check :rightBabbling ){
                if (s.contains(check)){
                    s = s.replace(check, "1");
                }
            }
            for (String c : s.split("")){
                if(!c.equals("1")) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag){
                list.add(s);
            }
        }
        return answer = list.size();
    }

    public static void main(String[] args) {
//        String[] str1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] str2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
//        System.out.println(solution(str1));
        System.out.println(solution(str2));
    }
}
