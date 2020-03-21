package com.acompany.app;
// com.acompany 밑의 app 패키지
import com.acompany.Product;
// Product 클래스를 사용할거니 import 해준다.

public class AppMain {
    public static void main(String[] args) {
        Product myProd = new Product ();
        // Product 클래스를 사용하기 위한 디폴트 객체 생성 (파라미터 사용하지 않음)
        System.out.println(myProd);
        // => 파라미터를 사용하지 않았으므로 네 개의 멤버변수의 디폴트값이 출력됨

        System.out.println();

        // 이젠 세터를 통해 파라미터값 줘서 출력하기.
        myProd.setProductId((1));
        myProd.setPrice(2000);
        myProd.setTitle("Iphone 5");
        myProd.setCreateDate("2020-08-15");
        System.out.println(myProd);

    }
}
