package com.acompany.exceptions;
//// 사용자 정의 에러 만들기, 예외 rethrowing ////
public class BizException extends RuntimeException {
    // RuntimeException을 상속받고 여러 생성자를 만든다.
    public BizException() {
        super();
    }

    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception e) {
        super(e);
    }

    public BizException(String msg, Exception e){
        super(msg, e);
    }
}
