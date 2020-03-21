import java.util.List;
import java.util.ArrayList;
public class L7_Methods {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5;
        int b = 3;

        int result = add(a, b);
        System.out.println(result);

        // Call by Value �Լ� ȣ���ϱ�.
        int byValue = 5;
        callByValue(byValue);
        System.out.println(byValue);
        // call by value �Լ��� ���� 5 + 5 = 10�� �Ǿ������� ������ byValue�� 5��, �޼ҵ� ȣ�� �Ŀ��� �ٲ��� ����.
        // ��? ������ ȣ���Ҷ��� ������ �Ѿ�°� �ƴ϶� ���� ���纻�� �Ѿ�� ����.

        // Call by Reference �Լ� ȣ���ϱ�.
        List<String> byRef = new ArrayList<>();
        byRef.add("red");
        byRef.add("blue");
        System.out.println(byRef);
        callByReference(byRef);
        System.out.println(byRef);
        // �޼ҵ� �ѱ�� ���� ����, ��翴�µ� �ѱ�� ���� ȭ��Ʈ�� �߰����� Ȯ��.
        // ������ �����ؼ� �ѱ�°� �ƴ϶�, ���� ��ü�� �ּҰ��� �ѱ�� ������ �޼ҵ� ���ο����� �ּҰ� ���ο� �ִ� ���� ����Ʈ�� �������� �����Ѵ�.
        // �׷��� ������ ���� ������ ����ǰ� �ȴ�.
    }

    // �޼ҵ�� �и�
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
