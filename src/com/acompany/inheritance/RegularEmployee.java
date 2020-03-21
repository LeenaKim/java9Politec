package com.acompany.inheritance;

public final class RegularEmployee extends Employee {
    // 이 클래스를 final로 선언하게 되면 하위 클래스를 만들 수 없게된다.
    // 즉, 이 클래스의 메소드들은 오버라이딩 대상이 아니게 됨.
    private final int transportationAllowance;
    // 멤버변수에 final이 붙으면 상수가 됨. 더이상 바뀌지 않는다.
    public RegularEmployee(String name, long salary, int transportationAllowance) {
        super(name, salary);
        this.transportationAllowance = transportationAllowance;
    }

    @Override
    public final long paySalary() {
        // 메소드에 final이 붙어버리면 이 메소드는 오버라이딩 되지 않는다.
        // final 메소드는 cpu를 많이 차지하는 복잡한 연산이면 final이 붙으면서 전기 바인딩이 일어나며 수행 속도가 훨씬 빨라진다.
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
