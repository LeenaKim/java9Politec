import java.util.Scanner;

public class L4_ControlFlow {
    public void ifElse(int age) {

        // Scanner�� �Է¹��� ���� ������ ���ڿ��̹Ƿ� ��Ʈ������ �ٲ���� ��.
        if (age>=20) {
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }
    }

    public void ifAndOr(int age) {
        // �񱳿����ڿ� �������ڸ� ���� ����ؼ� ������.
        if (age>=20 && age<40) {
            System.out.println("û��");
        } else if (age>40 && age<60) {
            System.out.println("���");
        } else {
            System.out.println("etc");
        }
    }
    // switch�� Ȱ���ϱ�. ������ �ƴ϶� ��Ȯ�� ���� ������ �б��� �� ���ϴ�.
    public void swItch(String color) {
        switch (color) {
            case "red":
                System.out.println("you're energetic.");
                break;
            case "blue":
                System.out.println("you're emotional.");
                break;
            case "green": case "yellow":
                System.out.println("I don't know.");
                break;
            default:
                System.out.println("I can't know.");
        }
        // => break�� ���� ������ ��� ���̽��� �� ��µ�.
        // java7���� switch���� String�� �� �� �ְ� �Ǹ鼭 ���� ���̱� �����ߴ�.
    }

    public static void main(String[] args) {

        Scanner fromUser = new Scanner(System.in);
        System.out.print("Put your age");
        String theAge = fromUser.next();
        int age = Integer.parseInt(theAge);


        Scanner in = new Scanner(System.in);
        System.out.println("Your favorite color");
        String color = in.next();


    }
}
