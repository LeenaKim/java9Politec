package com.acompany.lambda;

import java.util.Arrays;
import java.util.Comparator;

//// Comparator 예제 방법 1 - 함수형 인터페이스 객체화, 파라미터로 넘겨줌 ////
public class LambdaTest2 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey"};
        AnimalComparator comparator = new AnimalComparator();
        // 파라미터로 (배열, 정렬 로직 객)
        Arrays.sort(animals, comparator);

        for (String item : animals){
            System.out.println(item);
        }
    }
    // 자바는 함수를 파라미터로 넣을 수 없기 때문에 함수를 포함한 객체를 만들어줘야 함
    static class AnimalComparator implements Comparator<String>{
        // Comparator 인터페이스의 추상메소드를 구현해줘야 함.
        @Override // 함수형 인터페이스를 객체화하여 파라미터로 넘겨준다.
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
