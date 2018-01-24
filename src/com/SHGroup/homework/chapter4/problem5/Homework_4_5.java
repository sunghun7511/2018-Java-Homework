package com.SHGroup.homework.chapter4.problem5;

import com.SHGroup.homework.HomeworkClass;

import java.util.Vector;

public class Homework_4_5 extends HomeworkClass {
    /*
        다수의 클래스를 정의하고 활용하는 연습을 해보자. 더하기(+), 빼기(-), 곱하기(*), 나누기(/)를
        수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라. 이들은 모두 다음 필드와 메소드를 가진다.

         - int 타입의 a, b 필드 : 연산하고자 하는 피연산자
         - void setValue(int a, int b) : 피연산자를 객체 내에 설정한다.
         - int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 그 결과를 리턴한다.

        main() 메소드에서는 다음 실행 사례의 그림과 같이 키보드로부터 두 정수와 계산하고자 하는
        연산자를 입력받은 후 Add, Sub, Mul, Div 중에서이 연산을 실행할 수 있는 객체를 생성하고
        setValue()와 calculate()를 호출하여 그 결과 값을 화면에 출력한다.
     */

    public final void run() {
        int a = 10, b = 2;

        CalculatorBase base = null;

        base = new Add();
        base.setValue(a, b);

        System.out.println(Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(base.calculate()));

        base = new Sub();
        base.setValue(a, b);

        System.out.println(Integer.toString(a) + " - " + Integer.toString(b) + " = " + Integer.toString(base.calculate()));

        base = new Mul();
        base.setValue(a, b);

        System.out.println(Integer.toString(a) + " * " + Integer.toString(b) + " = " + Integer.toString(base.calculate()));

        base = new Div();
        base.setValue(a, b);

        System.out.println(Integer.toString(a) + " / " + Integer.toString(b) + " = " + Integer.toString(base.calculate()));
    }

    public abstract class CalculatorBase {
        protected int a;
        protected int b;

        public abstract void setValue(int a, int b);
        public abstract int calculate();
    }

    public class Add extends CalculatorBase {
        public Add(){}

        public final void setValue(int a, int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a + b;
        }
    }

    public class Sub extends CalculatorBase {
        public Sub(){}

        public final void setValue(int a, int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a - b;
        }
    }

    public class Mul extends CalculatorBase {
        public Mul(){}

        public final void setValue(int a, int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a * b;
        }
    }

    public class Div extends CalculatorBase {
        public Div(){}

        public final void setValue(int a, int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a / b;
        }
    }
}
