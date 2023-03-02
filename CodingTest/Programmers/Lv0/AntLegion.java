public class AntLegion {
    //프로그래머스 : 개미군단
    public int solution(int hp) {
        int answer = 0;
        final int general = 5;
        final int barrack = 3;
        final int worker = 1;

        answer += hp / general;
        hp = hp % general;

        answer +=hp / barrack;
        hp = hp % barrack;

        answer += hp / worker;

        return answer;
    }
}
