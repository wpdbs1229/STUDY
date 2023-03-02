public class ConditionOfTriangle {

    public int solution(int[] sides) {

        //프로그래머스 : 삼각형의 완성조건(2)
        int answer = 0;
        int minside = Math.min(sides[1],sides[0]);
        int longside = Math.max(sides[1],sides[0]);

        for (int i = 1; i <= longside ; i++) {
            if (minside + i > longside){
                answer++;
            }
        }

        answer += longside+minside -longside -1;


        return answer;
    }

}
