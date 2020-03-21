//// 인터페이스 만들기 ////
package com.acompany.inheritance;

// Payable처럼 추상메소드가 하나인 인터페이스를 FunctionalInterface라고 붙여준다.
@FunctionalInterface //(함수형 인터페이스)
public interface Payable {
    // 월급주는 추상메소드 만들기
    long paySalary(); // public abstract는 생략 가능

    // 수당을 주는 메소드 만들기
    /*long payAllowance();
        //=> 수당은 새로생긴 메소드기때문에 이 Payable을 임플레멘트한 Employee를 상속받은 Manager과 RegularEmployee에서 오버라이딩 하지 않았으므로 문제가 생김.
        // 기존 자바는 이렇게 쉽게 인터페이스의 메소드를 바꿀 수 없었음.
    */

    // 디폴트 메소드 추가
    default long payAllowance() {
        callLocal();
        return 0;
    }
    // => 사용하고싶으면 각 클래스에서 오버라이딩을 하면 되고, 안해도 문제가 없음.

    // Java9 private method 추가
    private void callLocal() {
        // 디폴트 메소드에서 코드가 길어질 때 복잡한 부분을 따로 개별 private 함수로 만든다.
    }
    // 정적 메소드 추가
    static long testStatic() {
        return 1;
    }



}
