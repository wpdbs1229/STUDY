public class ClothingStoreDiscounts {
    //프로그래머스 : 옷가게에서 할인 받기
    public static int solution(int price) {

        int answer = 0;
        if (price >=100_000&& price < 300_000){
            price -= price *0.05;
        } else if (price >= 300_000 && price < 500_000){
            price -= price *0.1;
        } else if (price >=500_000){
            price -= price *0.2;
        }

        return answer = price;
    }

    public static void main(String[] args) {
        solution(580_000);
    }
}
