public class NumberOfDice {
    // 프로그래머스 : 주사위 갯수
    public int solution(int[] box, int n) {
        int answer = 0;
        int widthNum = box[0]/n;
        int lengthNum = box[1]/n;
        int heightNum = box[2]/n;
        return answer = (widthNum * lengthNum) *heightNum;
    }
}
