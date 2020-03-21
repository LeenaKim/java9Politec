package com.acompany.inheritance;

public class Manager extends Employee { // Employee클래스의 추상메소드를 구현하지 않았기 때문에 에러가 남
    // 매니저 클래스에서 사용할 멤버변수 생성
    private long bonus;

    // 생성자 추가. 부모 클래스에서 받은 name, salary와 자식클래스에서 새로 만든 멤버변수 bonus까지 생김.
    public Manager(String name, long salary, long bonus) {
        super(name, salary); // 부모클래스의 생성자를 호출
        this.bonus = bonus; // 자기 자신의 생성자
    }

    // 부모클래스의 추상메소드 구현하기
    @Override
    public long paySalary() {
        return this.getSalary()/12+this.bonus; // 멤버변수 salary가 private이기 때문에 직접 this.salary는 못씀.
                            // 만약 멤버변수가 private이 아니라 protected면 자식 클래스에게는 보여주겠다는 것이니 가능.

    }

    public long getBonus() { //게터는 name과 salary는 부모클래스에서 상속받았기 때문에 자기 자신의 멤버변수인 bonus만 생성됨
        return bonus;
    }

    @Override
    public String toString() {
        return  super.toString()+ // 부모클래스의 name과 salary도 출력하고싶다면 super이라는 부모클래스를 지칭하는 객체에 toString() 메소드를 포함해줌.
                "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
