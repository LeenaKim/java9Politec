public class L5_Arrays {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        System.out.println(intArr);
        //=> 이렇게 출력하면 객체가 있는 주소값이 출력되게 됨.
        System.out.println(intArr[3]);
        //=> 인덱스가 주어지면 값에 접근 가능.

        //배열 전체를 풀스캔 할땐 반복분 사용.
        for (int i=0; i<intArr.length; i++) {
            System.out.printf("%d", intArr[i]);
        }

        System.out.println();

        //새로운 for문이 자바 5부터 추가됨.
        for (int item:intArr) {
            System.out.printf("%d", item);
        }

        System.out.println();

        //배열 선언 다른 방법
        int[] intArr2 = {1,2,3,4,5,6};
        for(int item:intArr2) {
            System.out.printf("%d", item);
        }

        //2차원 배열
        int[][] twoDimArr = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304},
                {401, 402, 403, 404}
        };
        //2차원 배열 : 테이블 형 데이터
        //202호, 403호는 배달하지 않고, 나머지 집에 우유를 배달하는 코드.
        for(int[] floor:twoDimArr) {
            for(int home:floor) {
                if(home==202||home==403) {
                    continue; //밑코드를 수행하지 않고 다음 for문으로 돌아간다.
                }
                System.out.println(home);
            }
        }
    }
}
