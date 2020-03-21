package com.acompany.inheritance;
// �߻�Ŭ����ȭ��Ű��
public abstract class Employee implements Payable/* extends Object�� �����Ȱ� */ {
    // �������
    protected String name;
    protected long salary;

    // ������
    public Employee(String name, long salary) {
        this.name=name;
        this.salary=salary;
    }

    // �߻�޼ҵ� �����
    public abstract long paySalary();
        //=> Employee�� ��ӹ޴� ��� Ŭ�������� paySalary �޼ҵ带 ��������� ��.

    // ����
    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
    // toString �޼ҵ� �߰�
    @Override // ������Ʈ Ŭ������ toString �޼ҵ��� ������ ����Ŭ������ Employee���� �������̵���.
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
