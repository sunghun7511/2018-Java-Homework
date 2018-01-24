package com.SHGroup.homework.chapter2.problem7;

import com.SHGroup.homework.HomeworkClass;

import java.util.Scanner;

public class Homework_2_7 extends HomeworkClass {
    /*
        7. 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
        (50, 50)과 (100, 100)의 두 점으로 이루어진 사각형이 있다고 하자.
        이때 키보드로부터 한 점을 구성하는 정수 x와 y 값을 입력받고
        점(x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
     */
    public final void run() {
        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("점의 X 값을 입력하세요 : ");
        x = sc.nextInt();

        System.out.print("점의 Y 값을 입력하세요 : ");
        y = sc.nextInt();

        sc.close();

        if((x <= 100 && x >= 50)
                && (y <= 100 && y >= 50)){
            System.out.println("해당 점은 그 사각형 안에 있습니다.");
        }else{
            System.out.println("해당 점은 그 사각형 안에 없습니다.");
        }
    }
}
