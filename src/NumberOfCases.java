import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NumberOfCases {
    public static void main(String[] args) {

        //1. 합의 법칙
        //2개의 주사위를 던졌을 때 합이 3 또는 4의 배수일 경우의 수
        int[] dice1 = {1,2,3,4,5,6};
        int[] dice2 = {1,2,3,4,5,6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;
        System.out.println("====합의 법칙====");
        //기본 풀이
        for(int item1 : dice1){
            for( int item2 : dice2){
                if((item1+item2)% 3 == 0){
                    nA += 1;
                }
                if((item1+item2)%4 == 0){
                    nB += 1;
                }
                if((item1+ item2)%12 == 0){
                    nAandB += 1;
                }
            }
        }
        System.out.println("결과 : " +(nA+nB-nAandB));

        // HashSet
        HashSet<ArrayList> allCase = new HashSet<>();
        for(int item1 : dice1){
            for(int item2 : dice2){
                if((item1 + item2)% 3 == 0 || (item1 + item2) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list); //Hash set이므로 중복케이스는 자동으로 걸러짐
                }
            }
        }
        System.out.println("결과 : " + allCase.size());

        //Array.asList : array을 list 처럼 사용할 수 있게해준다.
        //Array.asList의 경우, add(), remove() 사용 x
        //ArrayList list = new ArrayList(Arrays.asList(item1, item2)); 이와 같이 사용하면 add, remove 사용가능
        //원본 배열의 주소값을 가져오게 되므로, List값을 변경해도 배열의 값이 변경된다.

        //2. 곱의 법칙
        //두 개의 주사위 a, b을 던졌을 때 a는 3의 배수, b는 4의 배수읜 경우의 수
        System.out.println("====곱의 법칙====");

        nA = 0;
        nB = 0;

        for(int item1 : dice1){
            if(item1 % 3 ==0){
                nA++;
            }
        }
        for(int item2 : dice2){
            if(item2 % 4 ==0) {
                nB++;
            }
        }
        System.out.println("결과 : " + (nA*nB));
    }
}

