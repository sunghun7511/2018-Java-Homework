package com.SHGroup.homework.chapter8.problem6;

import com.SHGroup.homework.HomeworkClass;

import java.io.*;
import java.util.Scanner;

public class Homework_8_6 extends HomeworkClass {
    /*
        자바 소스 파일을 읽어들여 맨 앞에 행 번호를 붙여서 화면에 출력하는 프로그램을 작성하라.
     */

    public final void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input filename");
        String source = sc.nextLine();

        try {
            File output = new File(source);
            String out = readFileWithLine(output);
            writeFile(output, out);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public String readFileWithLine(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String all = "";
        int line = 0;
        String n;
        while((n = br.readLine()) != null){
            all += (line == 0 ? "" : "\n") + (line + 1) + " " + n;
            line ++;
        }
        br.close();

        return all;
    }

    public void writeFile(File f, String n) throws IOException{
        BufferedWriter br = new BufferedWriter(new FileWriter(f));
        br.write(n);
        br.flush();
        br.close();
    }
}
