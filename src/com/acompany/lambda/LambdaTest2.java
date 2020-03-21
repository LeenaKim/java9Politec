package com.acompany.lambda;

import java.util.Arrays;
import java.util.Comparator;

//// Comparator ���� ��� 1 - �Լ��� �������̽� ��üȭ, �Ķ���ͷ� �Ѱ��� ////
public class LambdaTest2 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey"};
        AnimalComparator comparator = new AnimalComparator();
        // �Ķ���ͷ� (�迭, ���� ���� ��)
        Arrays.sort(animals, comparator);

        for (String item : animals){
            System.out.println(item);
        }
    }
    // �ڹٴ� �Լ��� �Ķ���ͷ� ���� �� ���� ������ �Լ��� ������ ��ü�� �������� ��
    static class AnimalComparator implements Comparator<String>{
        // Comparator �������̽��� �߻�޼ҵ带 ��������� ��.
        @Override // �Լ��� �������̽��� ��üȭ�Ͽ� �Ķ���ͷ� �Ѱ��ش�.
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
