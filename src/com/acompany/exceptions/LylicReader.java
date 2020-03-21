package com.acompany.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LylicReader {
    public void doJob() {
        Path path = Paths.get("yesterday.txt");
        // ������ ����.

        Scanner in = null;
        // �ǵ������� ���� ���� �ٸ��� �ϰ� ���ܸ� ��ƺ���.
        try {
            in = new Scanner(path, "UTF-8");
            // ������ �о���δ�. �� ��, Scanner�� IOException�� �߰� �ȴ�. �� ��, �޼ҵ� ��忡�� �����ָ� ������ �������.
            in.useDelimiter("\n");
            while (in.hasNext()){
                System.out.println(in.next());
            }
            //in.close();  scanneró�� �ڿ��� ����ϴ� �ڵ�� ������ �� �ݾ���� �Ѵ�. �ƴϸ� finally�� �����ش�.
        } catch (IOException ie) {
            System.out.println("error occurred");
        } finally {
            if (in != null) in.close(); // finally�� �ݾ��൵ ������, �ڵ尡 �� �����ϴ�.
        }
    // => �̷��� �Ǹ� ������ �Ͼ�ٴ� ������ ����ϰ� ���������� ���α׷��� �����Ų��.

    }
}
