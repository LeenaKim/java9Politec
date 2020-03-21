public class L2_Variables {

    public static void main(String[] args) {
        int myInt = 334_345_255;
        //=> 보기 편하게 언더바로 구분 가능. 20억까지만.
        long myLong = 343_123_234_345_234_342L;
        //=> L 안붙이면 Int로 인식함.
        //자바에서는 long타입보다 더 큰 수도 사용할 수 있지만 별도의 class가 필요.

        double myDouble = 3.454566593948279348792384796;
        float myFloat = 3.123123123F;
        //=> 소숫점은 디폴트로 double로 잡히기 때문에 굳이 float으로 주려면 F 붙여줘야.
        //실제로 데이터는 마지막 소숫점자리까지 포함해도, 출력하게되면 6자리까지만 출력.

        int result = myInt+3;

        char myChar = 'A';
        //=> char은 딱 한 글자만 할당 가능.

        boolean myBool = true;
        boolean myBool2 = false;

    }

}
