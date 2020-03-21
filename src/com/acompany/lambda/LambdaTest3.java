package com.acompany.lambda;

import java.util.Arrays;
import java.util.Comparator;
//// Comparator 예제 방법 2 ////
public class LambdaTest3 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey"};
        Arrays.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String item : animals){
            System.out.println(item);
        }
    }
}
