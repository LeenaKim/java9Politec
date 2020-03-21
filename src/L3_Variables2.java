public class L3_Variables2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int addResult = 3+5;
        int subResult = 3-5;
        int mulResult = 3*5;
        int divResult = 3/5;
        //=> 결과는 0이 나온다. 정수와 정수의 연산은 결과값이 정수가 나오기 때문.
        double divResult2 = 3/5;
        //=> 0.0이 나옴. 애초에 정수 나누기 정수여서 답인 0을 소숫점을 포함해서 나오는것에서 끝남.
        double divResult3 = 3.0/5;
        //=> 3과 5중에 하나만 더블로 바꿔도 답이 더블로 나옴. 더블과 정수중에 더블이 더 큰 의미라 자동으로 결과값이 더블로 채택되어 나옴.
        int modResult = 5%3;
        System.out.println(modResult);
        //=> 나누기 연산은 몫으로 나오고, 나머지 연산은 모듈러스인 %로 해야함.

        // 사칙연산으로 해결되지 않는것은 Math클래스로 가능하다.
        double result = Math.pow(3, 4);
        // Math.pow는 더블타입으로 받고있기 때문에 더블 변수에 할당해야 함.

        double result2 = Math.sqrt(4);
        // 4의 제곱근을 반환한다.

		/*
		 기본적으로, 왼쪽의 변수와 오른쪽에 있는 값의 타입이 같아야지 연산이 이뤄진다.
		 타입이 다르더라도 할당이 되는것은 Casting이라는 타입 변환을 이용해 가능하다.
		 */

        // <<묵시적 캐스팅>>
        long along = 3;
        // => 3은 인트타입인데 long타입으로 변환되어 할당됨. 3이 3L로 바껴서 저장됨.
        double aDouble = 3.14F;
        // => 3.14는 플롯 타입인데 더블타입으로 묵시적 캐스팅이 되어 들어감.

        // <<명시적 캐스팅>> : 캐스팅을 강제로 해준다.
        int aInt = (int) 234L;
        float aFloat = (float) 3.14;
        // 보통 큰 타입을 작은 타입으로 바꿀때 명시적 캐스팅을 쓴다.

        // 문자열
        String aStr = "Hello, world"; // 문자열은 항상 쌍따옴표.
        String aStr2 = "Kim";
        String anotherStr = aStr.toUpperCase(); // 대문자로 변
        System.out.println(aStr + aStr2); // 두 문자열을 결합한다.
    }
}
