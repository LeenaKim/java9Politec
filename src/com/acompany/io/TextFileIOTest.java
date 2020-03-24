package com.acompany.io;

import java.io.*;

public class TextFileIOTest {
    public static void main(String[] args) {
        // 1. 텍스트 파일에서 파일 읽기 - 텍스트 파일에서부터 메모리 연결된 스트림 먼저 만들기. (앞서 스트림과는 다른 개념)
        try (BufferedReader in = new BufferedReader(
                new FileReader("cities.txt"))) {

            // BufferedReader : 스트림 소스가 어떤것이든 간에 그걸 버퍼링해서 읽어들이는 것


            String line; // 한줄씩
            while ((line = in.readLine()) != null) {// 읽어서
                System.out.println(line); // 처리(출력)
            }
        } catch (FileNotFoundException fe){
            // ...
        } catch (IOException ie) {
            // ...
        } // try in을 해줬으니 close를 해주지 않아도 됨.

        //in.close(); // resource는 반드시 클로즈 해줘야 함.

        // 2. 텍스트 파일로 쓰기 - 메모리부터 파일까지 아웃스트림 생성
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt"))) {

            out.write("hello world\nJava is very interesting language!");
        } catch (FileNotFoundException fe) {
            // ...
        } catch (IOException ie) {

        }
        //out.close(); // 스트림을 정확히 안닫으면 파일에 써지질 않음.
    }
}
