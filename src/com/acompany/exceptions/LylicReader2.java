package com.acompany.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
//// �ڹ�7���� �߰��� �� �� ���ϰ� ���ҽ� �ݴ¹� ////
public class LylicReader2 {
    public void doJob() {
        Path path = Paths.get("yesterday.txt");
        // ������ ����.

        // try ���� ��忡 ���ҽ��� �о���̰� �Ǹ� ���ܰ� �Ͼ�� ���� �ݵ�� ������ �ݾ��ְڴٴ� �ǹ�. �ڵ尡 ���������� �������� ������.
        try (Scanner in = new Scanner(path, "UTF-8");
            // ������ �о���δ�. �� ��, Scanner�� IOException�� �߰� �ȴ�. �� ��, �޼ҵ� ��忡�� �����ָ� ������ �������.
            in.useDelimiter("\n");
            while (in.hasNext()){
                System.out.println(in.next());
            }
            //in.close();  scanneró�� �ڿ��� ����ϴ� �ڵ�� ������ �� �ݾ���� �Ѵ�. �ƴϸ� finally�� �����ش�.
        } catch (IOException ie) {
            // ����� ���� ����, ����Ͻ����� �����
            throw new BizException("file doesn't exist", ie); // ������ ����� ���� ��ü�� �Ķ���ͷ� �Ѱܼ� �ٽ� ����������.
            // BizException Ŭ�������� ������ ��Ÿ�ӿ����� ������� ������ try���� ��忡�� �������� �ʾƵ� �ȴ�.
        }

    }
}
