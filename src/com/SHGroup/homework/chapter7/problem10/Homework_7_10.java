package com.SHGroup.homework.chapter7.problem10;

import com.SHGroup.homework.HomeworkClass;

import java.util.HashMap;
import java.util.Scanner;

public class Homework_7_10 extends HomeworkClass {
    /*
        지명과 위치 정보를 저장하고 관리하고자 한다. 지명은 String 타입으로,
        위치 정보를 위도와 경도를 가진 Location 이라는 클래스로 선언하고,
        지명을 '키'로 하여 HashMap<String, Location>에 키보드로 입력받아 5개의 요소를 저장하고,
        지명으로 검색하는 프로그램을 작성하라
     */

    private final HashMap<String, Location> locs = new HashMap<String, Location>();

    public final void run() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i ++){
            String name;
            double lat, lon;

            System.out.println("Input [" + (i+1) + "] place info");

            System.out.println("Input name");
            name = sc.nextLine();

            System.out.println("Input latitude");
            lat = sc.nextDouble();

            System.out.println("Input longitude");
            lon = sc.nextDouble();

            locs.put(name, new Location(name, lat, lon));
        }

        while(true){
            System.out.println("Input place name");
            String input = sc.nextLine();
            if(locs.containsKey(input)){
                locs.get(input).showInfo();
            }else{
                System.out.println("Not Found..");
            }
        }
    }

    public final class Location {
        private final String name;
        private final double lat, lon;
        public Location(final String name, final double lat, final double lon){
            this.name = name;
            this.lat = lat;
            this.lon = lon;
        }

        public void showInfo(){
            System.out.println("-- [ " + name + " ] --");
            System.out.println(" 위도 : " + lat);
            System.out.println(" 경도 : " + lon);
        }
    }
}
