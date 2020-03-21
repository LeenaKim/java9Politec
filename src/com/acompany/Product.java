package com.acompany;

public class Product {
    // ��������� ������ Ÿ���� ���غ���.
    // �Ϲ������� �ڹٴ� private���� ������� ����.
    private long productId; // 20�ﰳ �̻��� ��ǰ���� ���ð��� ����
    private String title;
    private int price;
    private String createDate;
        // => ��������� 4���� Product Ŭ������ �������.
        // ��������� private�̱� ������ �ܺο��� �������� ���ؼ� Setter, getter�� ���� ����ؾ� ��.

    //// �����ڿ� ���� ���� ������ ////
    // ���콺 ������ Ŭ�� -> Generate

    public Product(long productId, String title, int price, String createDate) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.createDate = createDate;
    }
    // �����ڸ� ����ó�� ���������� ����� ����Ʈ �����ڰ� �ڵ����� �ȸ�������� ������ ����Ʈ ������ ���� �����
    public Product() {
        productId=22;
        title="iphone7";
        price=5000;
        createDate="2020-03-18";
    }

    // ���� ���� �����
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

    // toString ���� (�Ȱ��� Generate����)
    // toString : ����������� �Է°��� ��� �� �ٷ� ���� ���ڿ� ���·� ���
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
