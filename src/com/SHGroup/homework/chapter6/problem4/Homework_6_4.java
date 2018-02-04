package com.SHGroup.homework.chapter6.problem4;

import com.SHGroup.homework.HomeworkClass;

public class Homework_6_4 extends HomeworkClass {
    /*
        int 타입의 x, y, radius 필드를 가지는 Circle 클래스를 작성하라.
        equals() 메소드를 재정의하여 두 개의 Circle 객체의 반지름이 같으면
        두 Circle 객체가 동일한 것으로 판별하도록 하라.
        Circle 클래스의 생성자는 3개의 인자를 가지며 x, y, radius 필드를 인자로 받아 초기화한다.
     */

    public final void run() {
        Circle c = new Circle(1, 1, 5);
        Circle c2 = new Circle(6, 2, 5);
        Circle c3 = new Circle(6, 2, 3);

        System.out.println("c == c2 : " + c.equals(c2));
        System.out.println("c == c3 : " + c.equals(c3));
        System.out.println("c2 == c3 : " + c2.equals(c3));
    }

    public class Circle {
        private final int x, y, radius;
        public Circle(int x, int y, int radius){
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        @Override
        public boolean equals(Object o){
            if(!(o instanceof Circle)){
                return false;
            }
            Circle c = (Circle)o;
            return c.radius == this.radius;
        }
    }
}
