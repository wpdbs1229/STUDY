/*
 1. Math.pow( a, b) => a^b 제곱
 2. Math.sqrt(9) => 제곱근  == Math.pow(9, 1.0/2)
 3. Math.abs(-3) => 3  절대값
 4. Math.log(Math.E) =1 밑이 E인 로그
 5. Math.log10(1000) =3 밑이 10인 로그
 6. Math.floor(10.9) =10 내림
 7. Math.ceil((10.9) =11 올림
 8. Math.round() = 반올림, 반내림
*/
public class PracticeMath {


    public static void main(String[] args) {

        System.out.println("--Pow--");
        System.out.println(Math.pow(3,2));

        System.out.println("--sqrt--");
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(9,1.0/2));

        System.out.println("--abs--");
        System.out.println(Math.abs(-3));
        System.out.println(Math.abs(3));

        System.out.println("--log--");
        System.out.println(Math.log10(1000)); //밑이 10
        System.out.println(Math.log(Math.E)); //밑이 자연상수 E = 2.718..045

        System.out.println("----round, floor, ceil----");
        System.out.println(Math.floor(10.5));//내림
        System.out.println(Math.ceil(10.8)); //올림
        System.out.println(Math.round(10.3) + Math.round(10.6)); //반올림
    }
}
