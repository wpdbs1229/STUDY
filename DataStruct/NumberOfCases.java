

public class NumberOfCases {


    public static void main(String[] args) {

/*
* 합의법칙
* 2의 배수(A) 와 3(B)의배수일 경우의 수
* 둘다 해당할 경우(AnB)
*/
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int A = 0;
        int B = 0;
        int AnB = 0;

        for (int num : arr){

            if( num  == 0)
                continue;
            if(num % 2 ==0)
                A++;
            else if(num % 3 == 0  )
                B++;

            else if (num % 6 == 0) {
                AnB++;
            }
        }

        System.out.println("합의 법칙 : " + (A+B-AnB));

        A = 0;
        B = 0;

        for (int num : arr){
            if(num % 2 ==0)
                A++;
            else if (num % 3 == 0) {
                B++;
            }
        }
        System.out.println("곱의 법칙 : " + (A*B));
    }
}
