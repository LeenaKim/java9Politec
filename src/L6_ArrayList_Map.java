public class L6_ArrayList_Map {
    public static void main(String[] args) {
        /////// List 사용 ///////
        // List는 배열 대체용이다. 배열보다 사용하기 편리하고 성능은 떨어질 수 있지만 대용량에선 오히려 성능을 발휘할 수 있도록 최적화되있다.
        List<String> myList = new ArrayList<>();
        // List 객체지만 실제론 ArrayList. 과거엔 ArrayList<String> 식으로 다 써줘야 했으나 지금은 상관 없다.
        myList.add("red");
        myList.add("blue");
        myList.add("green");
        myList.add("yellow");
        System.out.println(myList);
        // 배열은 반복문 써서 하나씩 출력해야하는데 리스트는 컨텐츠까지 잘 출력해준다.
        myList.add("black");
        // 리스트의 마지막 인덱스에 추가한다. 리스트도 배열과 마찬가지로 인덱스 시스템을 이용한다.
        String third = myList.get(2);
        System.out.println(third);
        // 2번 인덱스인 green이 출력됨을 확인.
        // 사이즈는 추가할때마다 계속해서 늘어난다.
        //myList.clear();
        //System.out.println(myList);
        // 	비어있는 리스트가 출력됨을 확인.

        /*------------------------------------------------------------------------*/

        // Immutable List (unmodifiableList)
        // 요즘에는 리스트 컨텐츠를 함부로 바꿀수 없는 형태인 Immutable List를 많이 사용함.
        // readonly의 느낌이고, 장점은 데이터를 병렬로 처리한다 할 때 데이터의 컨텐츠가 바뀌지 않아서 코드가 더 강건하게 작성될 수 있다.
        List<String> readOnlyList = Collections.unmodifiableList(myList);
        System.out.println(readOnlyList);
        //readOnlyList.add("white");
        //System.out.println(readOnlyList);
        // readOnly 리스트에 요소를 추가했을 때 에러가 발생함을 확인. readOnly 리스트에선 add자체가 불가능하다.

        /*------------------------------------------------------------------------*/

        // Java9 of 메소드 사용하여 Immutable List 사용.
        List<String> java9List = List.of("red", "blue", "green");
        // 이렇게 만들어진 java9List는 디폴트로 immutable List이다.
        // 따로 리스트 생성하고 add 할 필요 없이 바로 요소 추가 가능하다.
        System.out.println(java9List);
        java9List.add("white");
        // 에러 발생함을 확인. immutable collection이 디폴트기 때문에 add 불가능.

        /*=========================================================================*/

        /////// Map 사용 ///////
        Map<String, String> myMap = new HashMap<>();
        // Key와 Value 모두 String타입인 Map을 만들겠다.
        myMap.put("i5", "아이폰5");
        myMap.put("i6", "아이폰6");
        myMap.put("i7", "아이폰7");
        System.out.println(myMap);

        myMap.clear(); // 전체 데이터 삭제

        // Immutable Map
        Map<String, String> immutableMyMap = Collections.unmodifiableMap(myMap);

        // Java9 of 메소드 - 최초의 데이터 초기
        Map<String, String> java9Map =
                Map.of("i5", "아이폰5",
                        "i6", "아이폰6",
                        "i7", "아이폰7");
        java9Map.put("i8",  "아이폰8");
        // immutable이기 때문에 추가가 안됨을 확인.
    }
}
