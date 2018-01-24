package com.SHGroup.homework.chapter3.problem7;

import com.SHGroup.homework.HomeworkClass;

import java.util.Random;
import java.util.Scanner;

public class Homework_3_7 extends HomeworkClass {
    /*
        4×4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
     */

    private static final int ARR_MAX = 4;

    public final void run() {
        final Random r = new Random();

        int[][] arr = new int[ARR_MAX][ARR_MAX];

        for(int i = 0 ; i < ARR_MAX ; i ++){
            for(int j = 0 ; j < ARR_MAX ; j ++){
                arr[i][j] = r.nextInt() % 10 + 1;
                System.out.print((j == 0 ? "" : " ") + "[" + arr[i][j] + "]");
            }
            System.out.println();
        }
    }
}
