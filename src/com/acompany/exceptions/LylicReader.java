package com.acompany.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LylicReader {
    public void doJob() {
        Path path = Paths.get("yesterday.txt");
        // 파일을 연다.

        Scanner in = null;
        // 의도적으로 파일 명을 다르게 하고 예외를 잡아본다.
        try {
            in = new Scanner(path, "UTF-8");
            // 파일을 읽어들인다. 이 때, Scanner에 IOException이 뜨게 된다. 이 때, 메소드 헤드에서 던져주면 에러가 사라진다.
            in.useDelimiter("\n");
            while (in.hasNext()){
                System.out.println(in.next());
            }
            //in.close();  scanner처럼 자원을 사용하는 코드는 파일을 꼭 닫아줘야 한다. 아니면 finally를 적어준다.
        } catch (IOException ie) {
            System.out.println("error occurred");
        } finally {
            if (in != null) in.close(); // finally로 닫아줘도 되지만, 코드가 좀 복잡하다.
        }
    // => 이렇게 되면 에러가 일어났다는 문장을 출력하고 정상적으로 프로그램을 종료시킨다.

    }
}
