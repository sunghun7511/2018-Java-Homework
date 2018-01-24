package com.SHGroup.homework.chapter4.problem6;

import com.SHGroup.homework.HomeworkClass;

import java.util.Scanner;

public class Homework_4_6 extends HomeworkClass {
    /*
        간단한 공연 예약 시스템을 만들어보자.
        다수의 클래스를 다루고 객체의 배열을 다루기에는 아직 자바로 프로그램 개발이 익숙하지 않은
        초보자에게 다소 무리가 있을 것이다. 그러나 반드시 넘어야 할 산이다.
        이 도전 주제를 통해 산을 넘어갈 수 있는 체력을 키워보자. 공연 예약 시스템의 내용은 다음과 같다.

         - 공연은 하루에 한 번 있다.
         - 좌석은 S석, A석, B석 타입이 있으며 모두 10석의 좌석이 있다.
         - 공연 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
         - 예약은 한 자리만 예약할 수 있고 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
         - 조회는 모든 종류의 좌석을 표시한다.
         - 취소는 예약자의 이름을 입력하여 취소한다.
         - 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다.
     */

    private static final int ARR_MAX = 10;

    public final void run() {
        final Scanner sc = new Scanner(System.in);
        final Concert c = new Concert();

        while (true) {

            System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >>");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("좌석 구분 S, A, B >>");
                SeatType st = SeatType.getSeatTypeFromName(sc.next());

                if(st == null){
                    System.out.println("좌석 구분이 올바르지 않습니다.");
                    continue;
                }

                c.show(st);

                System.out.print("이름 : ");
                String name = sc.nextLine();

                System.out.print("번호 : ");
                int number = sc.nextInt();

                boolean b = c.doReservation(st, number, name);
                if(b){
                    System.out.println("예약에 성공하였습니다.");
                }else{
                    System.out.println("예약에 실패하였습니다.");
                }
            } else if (choice == 2) {
                for(SeatType st : SeatType.values())
                    c.show(st);
                System.out.println("<< 조회를 완료하였습니다. >>");
            } else if (choice == 3) {
                System.out.print("좌석 구분 S, A, B >>");
                SeatType st = SeatType.getSeatTypeFromName(sc.next());

                if(st == null){
                    System.out.println("좌석 구분이 올바르지 않습니다.");
                    continue;
                }

                c.show(st);

                System.out.print("이름 : ");
                String name = sc.nextLine();

                boolean cancel = c.doCancel(st, name);
                if(cancel){
                    System.out.println("<< 예약을 취소하였습니다. >>");
                }else{
                    System.out.println("<< 예약을 취소하지 못하였습니다. >>");
                }
            } else if (choice == 4) {
                break;
            }
        }
        sc.close();
    }

    public class Concert {
        private final String[] arrS = new String[ARR_MAX];
        private final String[] arrA = new String[ARR_MAX];
        private final String[] arrB = new String[ARR_MAX];

        public Concert(){
            for(int i = 0 ; i < ARR_MAX ; i ++){
                arrS[i] = null;
                arrA[i] = null;
                arrB[i] = null;
            }
        }

        public final boolean hasReservationed(final SeatType type, final int number){
            if(!check(type, number))
                return false;
            return getArray(type)[number - 1] != null;
        }

        public final boolean doReservation(final SeatType type, final int number, final String name){
            if(!check(type, number))
                return false;
            if(name == null)
                return false;
            getArray(type)[number - 1] = name;
            return true;
        }

        public final boolean doCancel(final SeatType type, final String name){
            if(type == null)
                return false;
            if(name == null)
                return false;
            String[] arr = getArray(type);
            for(int i = 0 ; i < ARR_MAX ; i ++){
                if(arr[i] != null
                        && arr[i].equals(name)){
                    arr[i] = null;
                    return true;
                }
            }
            return false;
        }

        public final void show(final SeatType type){
            if(type == null)
                return;
            System.out.print(type.name() + ">>");
            for(String n : getArray(type)){
                if(n == null){
                    System.out.print(" ---");
                }else{
                    System.out.print(" " + n);
                }
            }
        }

        private final boolean check(final SeatType type, final int number){
            if(type == null)
                return false;
            if(number < 1 || number > ARR_MAX)
                return false;
            return true;
        }

        private final String[] getArray(final SeatType type){
            if(type == SeatType.S){
                return arrS;
            }else if(type == SeatType.A){
                return arrA;
            }else if(type == SeatType.B){
                return arrB;
            }
            return null;
        }
    }

    public enum SeatType{
        S, A, B;

        public static SeatType getSeatTypeFromName(final String name){
            for(final SeatType st : values()){
                if(st.name().equals(name)){
                    return st;
                }
            }
            return null;
        }
    }
}
