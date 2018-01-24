package com.SHGroup.homework.chapter4.problem1;

import com.SHGroup.homework.HomeworkClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Homework_4_1 extends HomeworkClass {
    /*
        1. 노래를 나타내는 Song이라는 클래스를 설계하라. Song 클래스는 다음과 같은 필드를 갖는다.
         - 노래의 제목을 나타내는 title
         - 가수를 나타내는 artist
         - 노래가 속한 앨범 제목을 나타내는 album
         - 노래의 작곡가를 나타내는 composer, 작곡가는 여러 명 있을 수 있다.
         - 노래가 발표된 연도를 나타내는 year
         - 노래가 속한 앨범에서의 트랙 번호를 나타내는 track

        생성자는 기본 생성자와 모든 필드를 초기화하는 생성자를 작성하고, 노래의 정보를 출력하는 show() 메소드도 작성하라.
        ABBA의 "Dancing Queen" 노래를 Song 객체로 생성하고 show()를 이용하여 이 노래의 정보를 출력하는 프로그램을 작성하라.
     */

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public final void run() {
        Date date = null;
        try{
            date = dateFormat.parse("1976-08-15");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        Song dancingQueen = new Song("Dancing Queen", "ABBA", "Arrival", 1, date, "Benny Andersson", "Bjorn Ulvaeus");
        dancingQueen.show();
    }

    public class Song {
        private final String title;
        private final String artist;
        private final String album;

        private final int track;

        private final Vector<String> composer = new Vector<>();

        private final Date create_year;

        public Song(){
            this.title = "제목 없음";
            this.artist = "가수 없음";
            this.album = "앨범 없음";
            this.track = 0;
            Date create_year = null;
            try{
                create_year = dateFormat.parse("0000-00-00");
            }catch(Exception ex){
                ex.printStackTrace();
                create_year = null;
            }
            this.create_year = create_year;
        }

        public Song(String title, String artist, String album, int track, Date create_year, String... composers){
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.track = track;

            this.create_year = create_year;

            if(composers != null){
                for(String n : composers){
                    if(n == null)
                        continue;
                    composer.add(n);
                }
            }
        }

        public void show(){
            Vector<String> info = new Vector<>();
            info.add("=================");
            info.add("Track info");
            info.add("  Title : " + title);
            info.add("  Artist : " + artist);

            if(composer.size() > 0){
                info.add("  Composer");
                for(String n : composer){
                    info.add("    - " + n);
                }
            }
            info.add("  Album : " + album);
            info.add("  Track : " + Integer.toString(track));
            info.add("  Create Year : " + dateFormat.format(create_year));
            info.add("=================");

            for(String n : info)
                System.out.println(n);
        }
    }
}
