public class AlienLanguages {
    //프로그래머스 : 외계어 사전
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean check = true;
        for (String dicStr : dic){
            for (String speeStr : spell){
                check =true;
                if (!dicStr.contains(speeStr)){
                    check = false;
                    break;
                }
            }
            if (check){
                answer = 1;
                break;
            }

        }
        return answer;
    }
}
