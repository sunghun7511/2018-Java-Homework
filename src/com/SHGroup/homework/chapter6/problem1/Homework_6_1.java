package com.SHGroup.homework.chapter6.problem1;

import com.SHGroup.homework.HomeworkClass;

public class Homework_6_1 extends HomeworkClass {
    /*
        다음 main() 메소드의 실행 결과 "MyPoint(3, 20)"이 출력되도록 MyPoint 클래스를 작성하라.
        public static void main(String args[]) {
            MyPoint a = new MyPoint(3, 20);
            System.out.println(a);
        }
     */

    public final void run() {
        MyPoint a = new MyPoint(3, 20);
        System.out.println(a);
    }

    public final class MyPoint {
        private final int x, y;
        public MyPoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return "MyPoint(" + x + ", " + y + ")";
        }
    }
}
