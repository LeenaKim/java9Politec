//// �������̽� ����� ////
package com.acompany.inheritance;

// Payableó�� �߻�޼ҵ尡 �ϳ��� �������̽��� FunctionalInterface��� �ٿ��ش�.
@FunctionalInterface //(�Լ��� �������̽�)
public interface Payable {
    // �����ִ� �߻�޼ҵ� �����
    long paySalary(); // public abstract�� ���� ����

    // ������ �ִ� �޼ҵ� �����
    /*long payAllowance();
        //=> ������ ���λ��� �޼ҵ�⶧���� �� Payable�� ���÷���Ʈ�� Employee�� ��ӹ��� Manager�� RegularEmployee���� �������̵� ���� �ʾ����Ƿ� ������ ����.
        // ���� �ڹٴ� �̷��� ���� �������̽��� �޼ҵ带 �ٲ� �� ������.
    */

    // ����Ʈ �޼ҵ� �߰�
    default long payAllowance() {
        callLocal();
        return 0;
    }
    // => ����ϰ������ �� Ŭ�������� �������̵��� �ϸ� �ǰ�, ���ص� ������ ����.

    // Java9 private method �߰�
    private void callLocal() {
        // ����Ʈ �޼ҵ忡�� �ڵ尡 ����� �� ������ �κ��� ���� ���� private �Լ��� �����.
    }
    // ���� �޼ҵ� �߰�
    static long testStatic() {
        return 1;
    }



}
