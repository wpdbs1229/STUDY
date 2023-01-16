/*
* 점화식 : 수열의 여러항들이 만족시키는 관계식.
*
* 재귀함수 : 하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식.
*
* 피보나치 수열 : 1, 1, 2, 3, 5, 8, ...같이 앞의 두항을 합친 값이 다음 함이 되는 수열
*/
public class IgnitionType {

    //피보나치 수열의 점화식 : (n) = (n-2)+(n-1);
    //n 번째 항을 반환하는 재귀함수 작성
    public int Fibonacci(int n){
        if(n <= 2)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);

        // fibo(3)을 구하기 위해서는 fibo(2) +fibo(1)
        // fibo(6)을 구하기 위해서는 fibo(5) +fibo(4) = fibo(4) + fibo(3) + fibo(3) + fibo(2)
    }

    //피보나치 수열 반복문으로 구현
    public int Fiboloop(int n){

        int a =1;
        int b =1;
        int c =0;

        if(n <= 2)
            return 1;

        for (int i = 0; i <n; i++) {
            c = a + b;
            b = a;
            a = c;
        }
        return c;
    }
//
//    //factorial 점화식 n*(n-1)*(n-2)...*1
//    public int factorial(int n){
//        if( n == 1)
//            return 1;
//        return n * factorial(n-1);
//    }

    public static void main(String[] args) {

        IgnitionType ig = new IgnitionType();

        System.out.println("------fibo재귀함수-------");
        System.out.println(ig.Fibonacci(4));

        System.out.println("-------fiob반복문--------");
        System.out.println(ig.Fibonacci(4));

    }
}
