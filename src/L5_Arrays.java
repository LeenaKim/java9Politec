public class L5_Arrays {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        System.out.println(intArr);
        //=> �̷��� ����ϸ� ��ü�� �ִ� �ּҰ��� ��µǰ� ��.
        System.out.println(intArr[3]);
        //=> �ε����� �־����� ���� ���� ����.

        //�迭 ��ü�� Ǯ��ĵ �Ҷ� �ݺ��� ���.
        for (int i=0; i<intArr.length; i++) {
            System.out.printf("%d", intArr[i]);
        }

        System.out.println();

        //���ο� for���� �ڹ� 5���� �߰���.
        for (int item:intArr) {
            System.out.printf("%d", item);
        }

        System.out.println();

        //�迭 ���� �ٸ� ���
        int[] intArr2 = {1,2,3,4,5,6};
        for(int item:intArr2) {
            System.out.printf("%d", item);
        }

        //2���� �迭
        int[][] twoDimArr = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304},
                {401, 402, 403, 404}
        };
        //2���� �迭 : ���̺� �� ������
        //202ȣ, 403ȣ�� ������� �ʰ�, ������ ���� ������ ����ϴ� �ڵ�.
        for(int[] floor:twoDimArr) {
            for(int home:floor) {
                if(home==202||home==403) {
                    continue; //���ڵ带 �������� �ʰ� ���� for������ ���ư���.
                }
                System.out.println(home);
            }
        }
    }
}
