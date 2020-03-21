package com.acompany.lambda;

import java.util.Arrays;
import java.util.Comparator;
//// Comparator�� ���ٽ����� ǥ���ϱ� ////
public class LambdaTest {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey"};
        Arrays.sort(animals, (o1, o2) -> o1.length()-o2.length());
        // �Ķ���� ��� -> ������ ����
        // �� �Ķ������ Ÿ���� ������ Ÿ���� �Ƚ��൵ �ȴ�.
        for (String item : animals){
            System.out.println(item);
        }
    }
}
