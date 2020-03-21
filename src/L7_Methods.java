import java.util.List;
import java.util.ArrayList;
public class L7_Methods {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5;
        int b = 3;

        int result = add(a, b);
        System.out.println(result);

        // Call by Value 함수 호출하기.
        int byValue = 5;
        callByValue(byValue);
        System.out.println(byValue);
        // call by value 함수를 통해 5 + 5 = 10이 되야하지만 원본인 byValue는 5로, 메소드 호출 후에도 바뀌지 않음.
        // 왜? 값으로 호출할때는 원본이 넘어가는게 아니라 값의 복사본이 넘어가기 때문.

        // Call by Reference 함수 호출하기.
        List<String> byRef = new ArrayList<>();
        byRef.add("red");
        byRef.add("blue");
        System.out.println(byRef);
        callByReference(byRef);
        System.out.println(byRef);
        // 메소드 넘기기 전엔 레드, 블루였는데 넘기고 나니 화이트가 추가됨을 확인.
        // 변수를 복사해서 넘기는게 아니라, 실제 객체의 주소값을 넘기기 때문에 메소드 내부에서는 주소값 내부에 있는 실제 리스트의 컨텐츠를 변경한다.
        // 그렇기 때문에 실제 원본도 변경되게 된다.
    }

    // 메소드로 분리
    public static int add(int first, int second) {
        return first + second;
    }

    // Call by Value
    public static void callByValue(int param) {
        param = param + 5;
    }

    // Call by Reference
    public static void callByReference(List param) {
        param.add("white");
    }
}
