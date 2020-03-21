package com.acompany.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//// 리스트로 정렬해보기 1 ////
public class LambdaTestList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo", "a", "giraffe", "elephant", "monkey", "")
        );

        // 글자가 하나이거나 없는 요소를 제거해보자. 원래는 반복문을 쓰지만 람다를 이용해보자.
        AnimalPredicate animalPredicate = new AnimalPredicate();
        animals.removeIf(animalPredicate);

        System.out.println(animals);

    }

    static class AnimalPredicate implements Predicate<String>{
        @Override
        public boolean test(String s) {
            return s.length()<2; // 2글자 미만인 문자열은 True가 반환되며 제거됨.
        }
    }
}
