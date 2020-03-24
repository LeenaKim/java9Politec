package com.acompany.io;

import java.io.*;

public class TextFileIOTest {
    public static void main(String[] args) {
        // 1. �ؽ�Ʈ ���Ͽ��� ���� �б� - �ؽ�Ʈ ���Ͽ������� �޸� ����� ��Ʈ�� ���� �����. (�ռ� ��Ʈ������ �ٸ� ����)
        try (BufferedReader in = new BufferedReader(
                new FileReader("cities.txt"))) {

            // BufferedReader : ��Ʈ�� �ҽ��� ����̵� ���� �װ� ���۸��ؼ� �о���̴� ��


            String line; // ���پ�
            while ((line = in.readLine()) != null) {// �о
                System.out.println(line); // ó��(���)
            }
        } catch (FileNotFoundException fe){
            // ...
        } catch (IOException ie) {
            // ...
        } // try in�� �������� close�� ������ �ʾƵ� ��.

        //in.close(); // resource�� �ݵ�� Ŭ���� ����� ��.

        // 2. �ؽ�Ʈ ���Ϸ� ���� - �޸𸮺��� ���ϱ��� �ƿ���Ʈ�� ����
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt"))) {

            out.write("hello world\nJava is very interesting language!");
        } catch (FileNotFoundException fe) {
            // ...
        } catch (IOException ie) {

        }
        //out.close(); // ��Ʈ���� ��Ȯ�� �ȴ����� ���Ͽ� ������ ����.
    }
}
