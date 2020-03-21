package com.acompany.inheritance;

public class Manager extends Employee { // EmployeeŬ������ �߻�޼ҵ带 �������� �ʾұ� ������ ������ ��
    // �Ŵ��� Ŭ�������� ����� ������� ����
    private long bonus;

    // ������ �߰�. �θ� Ŭ�������� ���� name, salary�� �ڽ�Ŭ�������� ���� ���� ������� bonus���� ����.
    public Manager(String name, long salary, long bonus) {
        super(name, salary); // �θ�Ŭ������ �����ڸ� ȣ��
        this.bonus = bonus; // �ڱ� �ڽ��� ������
    }

    // �θ�Ŭ������ �߻�޼ҵ� �����ϱ�
    @Override
    public long paySalary() {
        return this.getSalary()/12+this.bonus; // ������� salary�� private�̱� ������ ���� this.salary�� ����.
                            // ���� ��������� private�� �ƴ϶� protected�� �ڽ� Ŭ�������Դ� �����ְڴٴ� ���̴� ����.

    }

    public long getBonus() { //���ʹ� name�� salary�� �θ�Ŭ�������� ��ӹ޾ұ� ������ �ڱ� �ڽ��� ��������� bonus�� ������
        return bonus;
    }

    @Override
    public String toString() {
        return  super.toString()+ // �θ�Ŭ������ name�� salary�� ����ϰ�ʹٸ� super�̶�� �θ�Ŭ������ ��Ī�ϴ� ��ü�� toString() �޼ҵ带 ��������.
                "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
