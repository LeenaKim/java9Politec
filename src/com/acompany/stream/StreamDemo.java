package com.acompany.stream;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws IOException { // ���ܴ� �ϴ� �����ش�.
        // Path Ŭ������ �̿��� ������ �о���δ�.
        Path path = Paths.get("cities.txt");
        System.out.println(path.toAbsolutePath());

        // Files Ŭ������ ���پ� �а� ��Ʈ������ �����Ѵ�.
        Stream<String> stringStream = Files.lines(path);

        // forEach�� ����� ��Ʈ�� ��Ʈ���� �� ���κ��� ����غ���.
        //stringStream.forEach(System.out::println);

        // �������� �����ؼ� ����غ���. Map�� A�� ���� B�� ���´�.
        Optional<Integer> integer =
                // reduce�� ������ ���ڴ� null�ϼ���, �ƴҼ��� �ֱ� ������ optional�� üũ����� �Ѵ�.
                stringStream.map(l -> Integer.parseInt(l.split(",")[1].trim())) // ���⸦ �������� �и��� ���� 2��? �ε���. ��, �α����� ��µȴ�
                // ��µǴ� ���ڴ� String�̴�. �̸� ���ڷ� �ٽ� �ٲ��ֱ� ���� �켱 ���� �� ������ trim()���� �����ϰ� Integer.parseInt�� ����ȭ�Ѵ�.
                .filter(p -> p >= 1_000_000)
                // �α��� 100�� �̻��ΰ͸����� ���͸��Ѵ�.
                //.forEach(System.out::println);
                .reduce((a, b) -> a + b);


        System.out.println(integer.get());
        // �ռ� reduce�� ���� �α� ���� ��µȴ�.

        /*
        //// �����͸� �ǵ������� Null�� ������ ////
        integer = Optional.empty();
        System.out.println(integer.get());
        // => "No value present" ��� ������ ����. �׷��� �ɼų��� ���� nullpointexception�� ���� �� ����.
        */

        // ����ó�� get() �޼ҵ帻�� �ɼųο��� �����͸� �����ö� ifPresent �޼ҵ嵵 ���� ����.
        // ���� �����Ͱ� ������ ����϶�� ��.
        //integer.ifPresent(System.out::println);

        // �����Ͱ� ������ ���� �����͸�, ������ 0�� �������ּ���
        int data = integer.orElse(0);
        System.out.println(data);

    }

}
