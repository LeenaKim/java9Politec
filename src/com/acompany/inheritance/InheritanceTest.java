package com.acompany.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        /*Employee emp = new Employee("kim", 5000);
        System.out.println(emp);*/
        //=> ������Ʈ Ŭ������ toString() �޼ҵ尡 ȣ��Ǹ� �ּҰ��� ��µǰ� ��
        // toString �޼ҵ带 Employee Ŭ�������� �������̵��ؼ� �������� �� �ٽ� ����Ʈ�ϸ� name�� salary�� ��µ�.
        Manager mgr = new Manager("kim", 4000, 2000);
        // Employee mgr = new Manager �ص� ����. ������ Manager ��ü�� ����?�� ������. (is-a). Manager�� Employee�� ��ӹ޾ұ� ������.
        System.out.println(mgr);
        //=> ������Ʈ Ŭ������ toString() �޼ҵ尡 ȣ��Ǹ� �ּҰ��� ��µǰ� ��
        // Manager Ŭ�������� toString()�� �������̵��ϰԵǸ� Manager������ �ڽ��� ��������� bonus�� ����ϴ°����� toString()�� �����߱� ������ bonus�� ��µ�.
        // ������ Manager�� toString()�� super.toString()���� �θ�Ŭ������ toString() �޼ҵ���� �������شٸ� name�� salary ��� ��µ�.

        // �������̽��� static �޼ҵ�� ��ӵǴ°� �ƴϰ� �������̽����� �ٷ� ����ƽ �޼ҵ� �̸����� �����ϸ� �ȴ�.
       Payable.testStatic();
    }
}
