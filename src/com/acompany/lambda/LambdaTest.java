package com.acompany.lambda;

import java.util.Arrays;
import java.util.Comparator;
//// Comparator을 람다식으로 표현하기 ////
public class LambdaTest {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey"};
        Arrays.sort(animals, (o1, o2) -> o1.length()-o2.length());
        // 파라미터 목록 -> 적용할 로직
        // 두 파라미터의 타입이 같을땐 타입을 안써줘도 된다.
        for (String item : animals){
            System.out.println(item);
        }
    }
}
