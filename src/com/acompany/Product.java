package com.acompany;

public class Product {
    // 멤버변수로 데이터 타입을 정해보자.
    // 일반적으로 자바는 private으로 멤버변수 정의.
    private long productId; // 20억개 이상의 상품명이 나올것을 예상
    private String title;
    private int price;
    private String createDate;
        // => 멤버변수가 4개인 Product 클래스가 만들어짐.
        // 멤버변수가 private이기 때문에 외부에서 접근하지 못해서 Setter, getter를 만들어서 사용해야 함.

    //// 생성자와 게터 세터 만들자 ////
    // 마우스 오른쪽 클릭 -> Generate

    public Product(long productId, String title, int price, String createDate) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.createDate = createDate;
    }
    // 생성자를 위에처럼 인위적으로 만들면 디폴트 생성자가 자동으로 안만들어지기 때문에 디폴트 생성자 따로 만들기
    public Product() {
        productId=22;
        title="iphone7";
        price=5000;
        createDate="2020-03-18";
    }

    // 게터 세터 만들기
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    // toString 생성 (똑같이 Generate에서)
    // toString : 멤버변수들의 입력값을 모두 한 줄로 묶어 문자열 형태로 출력
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
