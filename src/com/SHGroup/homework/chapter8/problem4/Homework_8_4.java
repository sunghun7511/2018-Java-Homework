package com.SHGroup.homework.chapter8.problem4;

import com.SHGroup.homework.HomeworkClass;

import java.io.*;
import java.util.Scanner;

public class Homework_8_4 extends HomeworkClass {
    /*
        사용자로부터 두 개의 텍스트 파일 이름을 입력받고 첫 번째 파일 뒤에
        두 번째 파일을 덧붙여 새로운 파일을 생성하는 프로그램을 작성하라.
     */

    public final void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("First filename");
        String first = sc.nextLine();

        System.out.println("Second filename");
        String second = sc.nextLine();

        try{
            File f1 = new File(first);
            File f2 = new File(second);

            String all = "";
            all += readFile(f1);
            all += readFile(f2);

            writeFile(new File("out.txt"), all);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public String readFile(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String all = "";
        String n;
        while((n = br.readLine()) != null){
            all += (all.isEmpty()? n : "\n" + n);
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
