package com.acompany.exceptions;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        LylicReader reader = new LylicReader();
        try {
            reader.doJob();
        } catch (BizException e){
            System.out.println(e);
        } // 사용자 정의함수로 리쓰로잉 하게되면 마지막 말단에서 BizException만 예외로 잡아주면 됨.
        // LylicReader 클래스의 doJob에서 예외를 던져버렸기 때문에 doJob을 호출한 ExceptionTest 클래스에서 예외가 다시 발생하게 됨.
        // 여기서 또 예외를 던져버리게된다면 main함수에 예외가 발생한다.
    }
}
