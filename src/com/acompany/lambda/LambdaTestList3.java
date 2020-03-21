package com.acompany.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//// ����Ʈ ������ ���ٷ� ǥ���غ��� ////
public class LambdaTestList3 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo", "a", "giraffe", "elephant", "monkey", "")
        );
        animals.removeIf(s -> s.length() < 2);

        System.out.println(animals);

    }

}

