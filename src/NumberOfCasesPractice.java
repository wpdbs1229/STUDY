import java.util.ArrayList;

public class NumberOfCasesPractice {

    // 약수
    public ArrayList getDivisor(int num){
        ArrayList result = new ArrayList();
        // num/2를 하는 이유 : 절반 이후 부터는 나누어떨어지는 수가 없다.
        for (int i = 1; i <= (int)num/2; i++){
            if(num % i == 0){
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    //최대 공약수(GCD)
    //두수의 약수를 구한 후에 약수중에 같은 값이 있다면 gcd에 저장 더 큰 값이 나온다면 다시 저장
    public int getGCD(int numA, int numB){
        int gcd = -1;

        ArrayList divisorA =this.getDivisor(numA);
        ArrayList divisorB =this.getDivisor(numB);

        for (int itemA : (ArrayList<Integer>)divisorA){
            for(int itemB : (ArrayList<Integer>)divisorB) {
                if (itemA == itemB){
                    if(gcd < itemA)
                        gcd = itemA;
                }
            }
        }
        return gcd;
    }

    //최소공배수(LCM)
    public int getLCM(int numA, int numB){
        int lcm = -1;

        int gcd = this.getGCD(numA,numB);

        //최소 공배수는 : 주어진 두 수를 곱하고 gcd로 나눈 값
        if(gcd != -1){
            lcm = numA * numB /gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {
        //Test Code
        int number1 = 10;
        int number2 = 6;

        NumberOfCasesPractice p = new NumberOfCasesPractice();

        ArrayList l1 = p.getDivisor(number1);
        ArrayList l2 = p.getDivisor(number2);

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대공약수 " + p.getGCD(number1, number2));
        System.out.println("최소공배수 " + p.getLCM(number1,number2));
    }
}
