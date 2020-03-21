package com.acompany.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//// ����Ʈ�� �����غ��� 1 ////
public class LambdaTestList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo", "a", "giraffe", "elephant", "monkey", "")
        );

        // ���ڰ� �ϳ��̰ų� ���� ��Ҹ� �����غ���. ������ �ݺ����� ������ ���ٸ� �̿��غ���.
        AnimalPredicate animalPredicate = new AnimalPredicate();
        animals.removeIf(animalPredicate);

        System.out.println(animals);

    }

    static class AnimalPredicate implements Predicate<String>{
        @Override
        public boolean test(String s) {
            return s.length()<2; // 2���� �̸��� ���ڿ��� True�� ��ȯ�Ǹ� ���ŵ�.
        }
    }
}
