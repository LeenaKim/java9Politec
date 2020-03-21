import java.util.Scanner;

public class L4_ControlFlow {
    public void ifElse(int age) {

        // Scanner로 입력받은 값은 무조건 문자열이므로 인트형으로 바꿔줘야 함.
        if (age>=20) {
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }
    }

    public void ifAndOr(int age) {
        // 비교연산자와 논리연산자를 같이 사용해서 만들어보자.
        if (age>=20 && age<40) {
            System.out.println("청년");
        } else if (age>40 && age<60) {
            System.out.println("장년");
        } else {
            System.out.println("etc");
        }
    }
    // switch문 활용하기. 범위가 아니라 정확한 값을 가지고 분기할 때 편리하다.
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
        // => break를 걸지 않으면 모든 케이스가 다 출력됨.
        // java7부터 switch문에 String을 쓸 수 있게 되면서 많이 쓰이기 시작했다.
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
