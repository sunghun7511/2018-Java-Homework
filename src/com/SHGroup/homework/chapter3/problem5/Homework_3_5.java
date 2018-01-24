package com.SHGroup.homework.chapter3.problem5;

import com.SHGroup.homework.HomeworkClass;

import java.util.Scanner;

public class Homework_3_5 extends HomeworkClass {
    /*
        키보드로부터 정수를 10개 입력받아 배열에 저장하고 이 정수 중에서 3의 배수인 수만 골라 출력하는 프로그램을 작성하라.
     */

    private static final int ARR_MAX = 10;
    public final void run() {
        int[] arr = new int[ARR_MAX];
        int stack_ptr = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < ARR_MAX ; i ++){
            System.out.print(Integer.toString(i + 1) + "번재 숫자를 입력하세요 : ");

            int tmp = sc.nextInt();
            if(tmp % 3 == 0){
                arr[stack_ptr++] = tmp;
            }
        }

        if(stack_ptr == 0){
            System.out.println("입력한 수 중에서 3의 배수가 없습니다.");
        }else{
            System.out.print("입력한 수 중에서 3의 배수는 ");
            for(int i = 0 ; i < stack_ptr ; i ++){
                System.out.print((i != 0 ? ", " : "") + Integer.toString(arr[i]));
            }
            System.out.print("입니다.");
        }
    }
}
