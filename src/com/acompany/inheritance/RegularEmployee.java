package com.acompany.inheritance;

public final class RegularEmployee extends Employee {
    // �� Ŭ������ final�� �����ϰ� �Ǹ� ���� Ŭ������ ���� �� ���Եȴ�.
    // ��, �� Ŭ������ �޼ҵ���� �������̵� ����� �ƴϰ� ��.
    private final int transportationAllowance;
    // ��������� final�� ������ ����� ��. ���̻� �ٲ��� �ʴ´�.
    public RegularEmployee(String name, long salary, int transportationAllowance) {
        super(name, salary);
        this.transportationAllowance = transportationAllowance;
    }

    @Override
    public final long paySalary() {
        // �޼ҵ忡 final�� �پ������ �� �޼ҵ�� �������̵� ���� �ʴ´�.
        // final �޼ҵ�� cpu�� ���� �����ϴ� ������ �����̸� final�� �����鼭 ���� ���ε��� �Ͼ�� ���� �ӵ��� �ξ� ��������.
        return this.salary/12+this.transportationAllowance;
    }

    public int getTransportationAllowance() {
        return transportationAllowance;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "transportationAllowance=" + transportationAllowance +
                '}';
    }
}
