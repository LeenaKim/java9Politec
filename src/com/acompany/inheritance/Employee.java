package com.acompany.inheritance;
// 추상클래스화시키기
public abstract class Employee implements Payable/* extends Object가 생략된것 */ {
    // 멤버변수
    protected String name;
    protected long salary;

    // 생성자
    public Employee(String name, long salary) {
        this.name=name;
        this.salary=salary;
    }

    // 추상메소드 만들기
    public abstract long paySalary();
        //=> Employee를 상속받는 모든 클래스들은 paySalary 메소드를 구현해줘야 함.

    // 게터
    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
    // toString 메소드 추가
    @Override // 오브젝트 클래스의 toString 메소드의 원본을 하위클래스인 Employee에서 오버라이딩함.
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
