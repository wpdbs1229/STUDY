public class Permutation {

    /*
    * 순열 : 서로 다른 n개의 원소 중 r개르 중복하지 않고 선택하여 순서대로 나열하는 것
    * nPr = n(n-1)(n-2)(n-r+1), (0 <= r <= n)
    *
    * 공식
    * nPr = n! / (n-r)!
    *
    * 중복 순열 : 서로 다른 n개의 원소 중 중복을 허용하며 r개를 선택하여 순서대로 나열한 것
    *
    * 공식
    * n∏r = n^r
     * 조합(Combination) : 서로 다른 n개의 원소 중 r개를 중복하지 않고 선택하여 순서에 상관없이 나열하는 것
     *
     * 공식
     * nCr = nPr / r! = n! / (n-r)! r!
     *
     * 중복 조합 : 서로 다른 n개의 원소 중 중복을 허용하며 r개를 선택하여 순서에 상관없이 나열한 것
     *
     * 공식
     * nHr = n+r-1Cr
    */
    public int factiorial(int num){
        int a = 1;
        for (int i = 2; i<=num; i++){
            a *= i;
        }
        return a;
    }
    public static void main(String[] args) {

        // 순열 0,1,2,3,4,5의 6개 숫자로 만들어지는 4자리 숫자의 갯수

        int[] arr = {0,1,2,3,4,5};

        int n = 6; //6개의 숫자
        int r = 4; //4자리 숫자
        int result = 1;

        //순열 (중복 X) 같은 숫자가 들어가면 안됨 1111, 1221 x
        for (int i = n; i >n-r ; i--) {
            result *=i;
        }
        System.out.println("순열 : " + result);


        //중복 순열( 중복 o) 0,1,2,3,4,5 1111 o 1233 o
        result = 0;
        result = (int) Math.pow(n,r); // 제곱 n^r;

        System.out.println("중복 순열 : " + result);





    }
}
