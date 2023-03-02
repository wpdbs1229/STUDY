public class GcdnLcm {
    /*
    * 유클리드 호제법
    * 두 양의 정수 a,b (a > b), r = a % b 일때,
    * a, b의 최대공약수는 b,r의 최대공약수 와 같다.
    *
    * 6, 10  최대공약수.
    * 1. 큰 수 10
    * 2. 10 % 6 = 4(나머지)
    * 3. 6 % 4 = 2(나머지)
    * 4. 4 % 2 = 0(나머지)
    * 5. 나머지 0이므로 최대 공약수는 2가 된다.
    *
    * 최소 공배수 : a/최대공약수 * b/최대공약수 * 최대공약수
    */
    public int getGcd(int num1, int num2){

        int a = Math.max(num1,num2);
        int b = Math.min(num1,num2);

        // 큰 수를 작은 수로 나누기
        int r = a % b;

        // 작은 수로 나눈 나머지가 0일 때 작은 수가 최대공약수
        if(r == 0)
            return num2;
        //재귀를 통해 반복!
        else
            return getGcd(num2, r);

    }

    public int getLcm(int num1, int num2){

        int gcd = getGcd(num1, num2);

        int A = num1/gcd;
        int B = num2/gcd;

        /*
        최소 공배수 : num1/최대공약수 * num2/최대공약수 * 최대공약수
                  2 |_6_10  (나누는 수 )(나누기 연산)
                      3 5                  (몫)
         */
        int lcm = A*B*gcd;

        return lcm;
    }

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 10;

        GcdnLcm pra = new GcdnLcm();

        System.out.println("Gcd : " + pra.getGcd(num1, num2));
        System.out.println("Lcm : " + pra.getLcm(num1, num2));

    }
}
