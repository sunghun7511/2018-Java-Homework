package com.SHGroup.homework.chapter5.problem2;

import com.SHGroup.homework.HomeworkClass;
import com.SHGroup.homework.chapter4.problem5.Homework_4_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Homework_5_2 extends HomeworkClass {
    /*
        4장 연습문제 중 하나를 수정하여 완성해보자.
        더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수해애하는 각 클래스 Add, Sub, Mul, Div를 만들어라.
        이들은 모두 다음 필드와 메소드를 가진다.

         - int 타입의 a, b, 필드 : 연산하고자 하는 피연산자
         - void setValue(int a, int b) : 피연산자를 객체 내에 설정한다.
         - int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 그 결과를 리턴한다.

        Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상 클래스 Calc를 정의하고
        이들이 Calc를 상속받게 하라. main() 메소드에서는 다음 실행 사례의 그림과 같이 키보드로부터
        계산하고자 하는 연산자와 두 정수를 입력받은 후, Add, Sub, Mul, Div 중에서
        이 연산을 시행할 수 있는 객체를 생성하고 setValue()와 calculate()를 호출하여 그 결과 값을 화면에 출력하라.
     */

    public final void run() {
        final int a = 20, b = 2;

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

        public abstract void setValue(final int a, final int b);
        public abstract int calculate();
    }

    public class Add extends CalculatorBase {
        public Add(){}

        public final void setValue(final int a, final int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a + b;
        }
    }

    public class Sub extends CalculatorBase {
        public Sub(){}

        public final void setValue(final int a, final int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a - b;
        }
    }

    public class Mul extends CalculatorBase {
        public Mul(){}

        public final void setValue(final int a, final int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a * b;
        }
    }

    public class Div extends CalculatorBase {
        public Div(){}

        public final void setValue(final int a, final int b){
            this.a = a;
            this.b = b;
        }

        public final int calculate(){
            return a / b;
        }
    }
}
