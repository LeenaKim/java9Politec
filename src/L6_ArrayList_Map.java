public class L6_ArrayList_Map {
    public static void main(String[] args) {
        /////// List ��� ///////
        // List�� �迭 ��ü���̴�. �迭���� ����ϱ� ���ϰ� ������ ������ �� ������ ��뷮���� ������ ������ ������ �� �ֵ��� ����ȭ���ִ�.
        List<String> myList = new ArrayList<>();
        // List ��ü���� ������ ArrayList. ���ſ� ArrayList<String> ������ �� ����� ������ ������ ��� ����.
        myList.add("red");
        myList.add("blue");
        myList.add("green");
        myList.add("yellow");
        System.out.println(myList);
        // �迭�� �ݺ��� �Ἥ �ϳ��� ����ؾ��ϴµ� ����Ʈ�� ���������� �� ������ش�.
        myList.add("black");
        // ����Ʈ�� ������ �ε����� �߰��Ѵ�. ����Ʈ�� �迭�� ���������� �ε��� �ý����� �̿��Ѵ�.
        String third = myList.get(2);
        System.out.println(third);
        // 2�� �ε����� green�� ��µ��� Ȯ��.
        // ������� �߰��Ҷ����� ����ؼ� �þ��.
        //myList.clear();
        //System.out.println(myList);
        // 	����ִ� ����Ʈ�� ��µ��� Ȯ��.

        /*------------------------------------------------------------------------*/

        // Immutable List (unmodifiableList)
        // ���򿡴� ����Ʈ �������� �Ժη� �ٲܼ� ���� ������ Immutable List�� ���� �����.
        // readonly�� �����̰�, ������ �����͸� ���ķ� ó���Ѵ� �� �� �������� �������� �ٲ��� �ʾƼ� �ڵ尡 �� �����ϰ� �ۼ��� �� �ִ�.
        List<String> readOnlyList = Collections.unmodifiableList(myList);
        System.out.println(readOnlyList);
        //readOnlyList.add("white");
        //System.out.println(readOnlyList);
        // readOnly ����Ʈ�� ��Ҹ� �߰����� �� ������ �߻����� Ȯ��. readOnly ����Ʈ���� add��ü�� �Ұ����ϴ�.

        /*------------------------------------------------------------------------*/

        // Java9 of �޼ҵ� ����Ͽ� Immutable List ���.
        List<String> java9List = List.of("red", "blue", "green");
        // �̷��� ������� java9List�� ����Ʈ�� immutable List�̴�.
        // ���� ����Ʈ �����ϰ� add �� �ʿ� ���� �ٷ� ��� �߰� �����ϴ�.
        System.out.println(java9List);
        java9List.add("white");
        // ���� �߻����� Ȯ��. immutable collection�� ����Ʈ�� ������ add �Ұ���.

        /*=========================================================================*/

        /////// Map ��� ///////
        Map<String, String> myMap = new HashMap<>();
        // Key�� Value ��� StringŸ���� Map�� ����ڴ�.
        myMap.put("i5", "������5");
        myMap.put("i6", "������6");
        myMap.put("i7", "������7");
        System.out.println(myMap);

        myMap.clear(); // ��ü ������ ����

        // Immutable Map
        Map<String, String> immutableMyMap = Collections.unmodifiableMap(myMap);

        // Java9 of �޼ҵ� - ������ ������ �ʱ�
        Map<String, String> java9Map =
                Map.of("i5", "������5",
                        "i6", "������6",
                        "i7", "������7");
        java9Map.put("i8",  "������8");
        // immutable�̱� ������ �߰��� �ȵ��� Ȯ��.
    }
}
