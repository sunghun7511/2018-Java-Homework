package com.SHGroup.homework.chapter4.problem2;

import com.SHGroup.homework.HomeworkClass;

import java.util.Vector;

public class Homework_4_2 extends HomeworkClass {
    /*
        다음과 같은 멤버를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라.
         - int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성하는 두 점의 좌표
         - 생성자 2개 : 매개 변수 없는 생성자와 x1, y1, x2, y2의 값을 설정하는 생성자
         - void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
         - int square() : 사각형 넓이 리턴
         - void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
         - boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 직사각형이면 true 리턴
        Rectangle을 이용한 main() 메소드는 다음과 같으며 이 main() 메소드가 잘 작동하도록 하라.
     */

    public final void run() {
        Rectangle r = new Rectangle(0, 10, 10, 0);
        r.show();

        Rectangle r2 = new Rectangle(50, 10, 10, 50);
        Rectangle r3 = new Rectangle(0, 10, 10, 0);

        System.out.println(r.equals(r2) ? "r == r2" : "r != r2");
        System.out.println(r.equals(r3) ? "r == r3" : "r != r3");
    }

    public class Rectangle {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public Rectangle(){
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
        }

        public Rectangle(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public final void set(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public final int square(){
            return Math.abs(x1 - x2) * Math.abs(y1 - y2);
        }

        public final void show(){
            Vector<String> info = new Vector<>();

            info.add("=================");
            info.add("  x1 : " + Integer.toString(x1));
            info.add("  y1 : " + Integer.toString(y1));
            info.add("  x2 : " + Integer.toString(x2));
            info.add("  y2 : " + Integer.toString(y2));
            info.add("  square : " + Integer.toString(square()));
            info.add("=================");

            for(String n : info)
                System.out.println(n);
        }

        public final boolean equals(Rectangle r){
            return r != null
                    && r.x1 == this.x1
                    && r.y1 == this.y1
                    && r.x2 == this.x2
                    && r.y2 == this.y2;
        }
    }
}
