package com.acompany.exceptions;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        LylicReader reader = new LylicReader();
        try {
            reader.doJob();
        } catch (BizException e){
            System.out.println(e);
        } // ����� �����Լ��� �������� �ϰԵǸ� ������ ���ܿ��� BizException�� ���ܷ� ����ָ� ��.
        // LylicReader Ŭ������ doJob���� ���ܸ� �������ȱ� ������ doJob�� ȣ���� ExceptionTest Ŭ�������� ���ܰ� �ٽ� �߻��ϰ� ��.
        // ���⼭ �� ���ܸ� ���������Եȴٸ� main�Լ��� ���ܰ� �߻��Ѵ�.
    }
}
