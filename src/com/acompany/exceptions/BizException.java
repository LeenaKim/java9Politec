package com.acompany.exceptions;
//// ����� ���� ���� �����, ���� rethrowing ////
public class BizException extends RuntimeException {
    // RuntimeException�� ��ӹް� ���� �����ڸ� �����.
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
