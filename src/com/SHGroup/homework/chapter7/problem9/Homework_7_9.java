package com.SHGroup.homework.chapter7.problem9;

import com.SHGroup.homework.HomeworkClass;

import java.util.HashMap;
import java.util.Scanner;

public class Homework_7_9 extends HomeworkClass {
    /*
        하나의 학생 정보는 Student 클래스로 표현한다.
        Student 클래스에는 이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다.
        여기서 학번을 String 타입으로 선언한다.
        키보드에서 학생 정보를 5개 입력받아 학번을 '키'로 하여 HashMap<String, Student> 에
        저장하고 학번으로 학생 정보를 검색하여 출력하는 프로그램을 작성하여라.
        다음과 같은 해시맵을 이용하라.
     */

    private final HashMap<String, Student> dept = new HashMap<String, Student>();

    public final void run() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i ++){
            String name, type, number;
            int avg;

            System.out.println("Input [" + (i+1) + "] student info");

            System.out.println("Input name");
            name = sc.nextLine();

            System.out.println("Input type");
            type = sc.nextLine();

            System.out.println("Input number");
            number = sc.nextLine();

            System.out.println("Input avg");
            avg = sc.nextInt();

            dept.put(type, new Student(name, type, number, avg));
        }

        while(true){
            System.out.println("Input search number");
            String input = sc.nextLine();
            if(dept.containsKey(input)){
                dept.get(input).showInfo();
            }else{
                System.out.println("Not Found..");
            }
        }
    }

    public final class Student {
        private final String name, type, number;
        private final int avg;

        public Student(final String name, final String type, final String number, final int avg) {
            this.name = name;
            this.type = type;
            this.number = number;
            this.avg = avg;
        }

        public void showInfo(){
            System.out.println("[ " + name + "]");
            System.out.println(" 학과 : " + type + "]");
            System.out.println(" 학번 : " + number + "]");
            System.out.println(" 평균 : " + avg + "]");
        }
    }
}
