package com.acompany.stream;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws IOException { // 예외는 일단 던져준다.
        // Path 클래스를 이용해 파일을 읽어들인다.
        Path path = Paths.get("cities.txt");
        System.out.println(path.toAbsolutePath());

        // Files 클래스로 한줄씩 읽고 스트림으로 생성한다.
        Stream<String> stringStream = Files.lines(path);

        // forEach를 사용해 스트링 스트림을 각 라인별로 출력해보자.
        //stringStream.forEach(System.out::println);

        // 매핑으로 가공해서 출력해보자. Map은 A가 들어가서 B가 나온다.
        Optional<Integer> integer =
                // reduce로 나오는 숫자는 null일수도, 아닐수도 있기 때문에 optional로 체크해줘야 한다.
                stringStream.map(l -> Integer.parseInt(l.split(",")[1].trim())) // 띄어쓰기를 기준으로 분리한 것의 2번? 인덱스. 즉, 인구수만 출력된다
                // 출력되는 문자는 String이다. 이를 숫자로 다시 바꿔주기 위해 우선 문자 앞 공백을 trim()으로 제거하고 Integer.parseInt로 정수화한다.
                .filter(p -> p >= 1_000_000)
                // 인구가 100만 이상인것만으로 필터링한다.
                //.forEach(System.out::println);
                .reduce((a, b) -> a + b);


        System.out.println(integer.get());
        // 앞서 reduce로 구한 인구 합이 출력된다.

        /*
        //// 데이터를 의도적으로 Null로 만들어보자 ////
        integer = Optional.empty();
        System.out.println(integer.get());
        // => "No value present" 라는 에러가 나옴. 그래서 옵셔널을 쓰면 nullpointexception을 피할 수 있음.
        */

        // 위에처럼 get() 메소드말고 옵셔널에서 데이터를 가져올땐 ifPresent 메소드도 많이 쓴다.
        // 만약 데이터가 있으면 출력하라는 뜻.
        //integer.ifPresent(System.out::println);

        // 데이터가 있으면 원래 데이터를, 없으면 0을 리턴해주세요
        int data = integer.orElse(0);
        System.out.println(data);

    }

}
