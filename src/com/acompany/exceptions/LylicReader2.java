package com.acompany.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
//// 자바7에서 추가된 좀 더 편하게 리소스 닫는법 ////
public class LylicReader2 {
    public void doJob() {
        Path path = Paths.get("yesterday.txt");
        // 파일을 연다.

        // try 구문 헤드에 리소스를 읽어들이게 되면 예외가 일어나든 말든 반드시 파일을 닫아주겠다는 의미. 코드가 심플해지고 가독성이 좋아짐.
        try (Scanner in = new Scanner(path, "UTF-8");
            // 파일을 읽어들인다. 이 때, Scanner에 IOException이 뜨게 된다. 이 때, 메소드 헤드에서 던져주면 에러가 사라진다.
            in.useDelimiter("\n");
            while (in.hasNext()){
                System.out.println(in.next());
            }
            //in.close();  scanner처럼 자원을 사용하는 코드는 파일을 꼭 닫아줘야 한다. 아니면 finally를 적어준다.
        } catch (IOException ie) {
            // 사용자 정의 에러, 비즈니스예외 만들기
            throw new BizException("file doesn't exist", ie); // 예외의 내용과 예외 객체를 파라미터로 넘겨서 다시 던져버린다.
            // BizException 클래스에서 에러를 런타임에러로 만들었기 때문에 try구문 헤드에서 던져주지 않아도 된다.
        }

    }
}
