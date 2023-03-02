/*
 *조합(Combination) : 서로 다른 n개의 원소 중 r개를 중복하지 않고 선택하여 순서에 상관없이 나열하는 것
 *
 * 공식
 * nCr = nPr / r! = n! / (n-r)! r!
 *
 * 중복 조합 : 서로 다른 n개의 원소 중 중복을 허용하며 r개를 선택하여 순서에 상관없이 나열한 것
 *
 * 공식
 * nHr = n+r-1Cr
 */
public class Combination {


    //조합 당구공 15개가 들은 상자에서 5개를 꺼내는 경우

    public static void main(String[] args) {
        int n = 15; // 당구공 갯수
        int r = 5; // 꺼내는 공갯수
        int rfactiorial = 1;
        int permutaiton = 1;
        int result = 0;


        // 조합 순서 x 중복 x
        for (int i = n; i > n-r; i--) {
            permutaiton *=i;
        }

        for (int i = 1; i <=r; i++) {
            rfactiorial *=i;
        }

        result = permutaiton/rfactiorial;
        System.out.println("조합 : " + result);

        //중복조합 순서 x 중복 o
        n = n+r-1;
        result = 0;
        rfactiorial = 1;
        permutaiton = 1;
        for (int i = n; i > n-r; i--){
            permutaiton *= i;
        }

        for (int i = 1; i <=r; i++) {
            rfactiorial *= i;
        }
        result = permutaiton/rfactiorial;
        System.out.println("중복조합 : " + result);
    }



}
