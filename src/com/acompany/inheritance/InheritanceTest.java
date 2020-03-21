package com.acompany.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        /*Employee emp = new Employee("kim", 5000);
        System.out.println(emp);*/
        //=> 오브젝트 클래스의 toString() 메소드가 호출되며 주소값이 출력되게 됨
        // toString 메소드를 Employee 클래스에서 오버라이딩해서 재정의한 후 다시 프린트하면 name과 salary가 출력됨.
        Manager mgr = new Manager("kim", 4000, 2000);
        // Employee mgr = new Manager 해도 가능. 어차피 Manager 객체로 선언?기 때문에. (is-a). Manager가 Employee를 상속받았기 때문에.
        System.out.println(mgr);
        //=> 오브젝트 클래스의 toString() 메소드가 호출되며 주소값이 출력되게 됨
        // Manager 클래스에서 toString()을 오버라이딩하게되면 Manager에서는 자신의 멤버변수인 bonus만 출력하는것으로 toString()을 정의했기 때문에 bonus만 출력됨.
        // 하지만 Manager의 toString()에 super.toString()으로 부모클래스의 toString() 메소드까지 포함해준다면 name과 salary 모두 출력됨.

        // 인터페이스의 static 메소드는 상속되는건 아니고 인터페이스에서 바로 스태틱 메소드 이름으로 접근하면 된다.
       Payable.testStatic();
    }
}
