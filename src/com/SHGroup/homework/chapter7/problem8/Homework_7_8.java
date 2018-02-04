package com.SHGroup.homework.chapter7.problem8;

import com.SHGroup.homework.HomeworkClass;

public class Homework_7_8 extends HomeworkClass {
    /*
        다음은 String만 다루는 MyClass 코드이다. MyClass 를 제네릭 클래스 MyClass<E>로 일반화하고,
        이를 이용하는 main() 메소드를 만들어 프로그램을 완성하라.
     */

    public final void run() {
        MyClass<String> mc = new MyClass<>("blabla");
        mc.setS("hello");
        System.out.println("haha : " + mc.getS());
    }

    public final class MyClass<T> {
        private T s;
        public MyClass(T s){
            this.s = s;
        }

        public void setS(T s){
            this.s = s;
        }

        public T getS(){
            return s;
        }
    }
}
