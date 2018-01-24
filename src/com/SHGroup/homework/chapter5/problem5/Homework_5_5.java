package com.SHGroup.homework.chapter5.problem5;

import com.SHGroup.homework.HomeworkClass;

public class Homework_5_5 extends HomeworkClass {
    /*
        추상 클래스의 서브 클래스 만들기에 필요한 추상 메소드 오버라이딩과 super()의 사용에 관한 문제이다. 다음과 같은 MyPoint 추상 클래스가 있다.

        abstract class MyPoint {
            int x;
            int y;
            public MyPoint(int x, int y) {
                this.x = x; this.y = y;
            }
            protected abstract void move(int x, int y); // 새로운 x, y 위치로 이동
            protected abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
            protected void show() {
                System.out.println(x+","+y);
            }
        }

        MyPoint를 상속받는 MyColorPoint 클래스를 작성하라.
        MyColorPoint의 생성자는 MyColorPoint(int x, int y, String color)로 하라. 그리고 다음과 같은 main() 메소드를 삽입하여 실행되도록 하라.

        public static void main(String[] args) {
            MyPoint p = new MyColorPoint(2, 3, "blue");
            p.move(3,4);
            p.reverse();
            p.show();
        }
     */

    public final void run() {
        MyPoint p = new MyColorPoint(2, 3, "blue");
        p.move(3,4);
        p.reverse();
        p.show();
    }
    public abstract class MyPoint {
        protected int x;
        protected int y;
        public MyPoint(int x, int y) {
            this.x = x; this.y = y;
        }
        protected abstract void move(final int x, final int y); // 새로운 x, y 위치로 이동
        protected abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
        protected void show() {
            System.out.println(x+","+y);
        }
    }

    public class MyColorPoint extends MyPoint {
        private final String color;

        public MyColorPoint(final int x, final int y, final String color) {
            super(x, y);
            this.color = color;
        }

        @Override
        protected void move(final int x, final int y){
            this.x = x;
            this.y = y;
        }

        @Override
        protected void reverse(){
            x ^= y;
            y ^= x;
            x ^= y;
        }

        @Override
        protected void show() {
            System.out.println(x + "," + y + "," + color);
        }
    }
}
