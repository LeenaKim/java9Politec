package com.acompany.app;
// com.acompany ���� app ��Ű��
import com.acompany.Product;
// Product Ŭ������ ����ҰŴ� import ���ش�.

public class AppMain {
    public static void main(String[] args) {
        Product myProd = new Product ();
        // Product Ŭ������ ����ϱ� ���� ����Ʈ ��ü ���� (�Ķ���� ������� ����)
        System.out.println(myProd);
        // => �Ķ���͸� ������� �ʾ����Ƿ� �� ���� ��������� ����Ʈ���� ��µ�

        System.out.println();

        // ���� ���͸� ���� �Ķ���Ͱ� �༭ ����ϱ�.
        myProd.setProductId((1));
        myProd.setPrice(2000);
        myProd.setTitle("Iphone 5");
        myProd.setCreateDate("2020-08-15");
        System.out.println(myProd);

    }
}
