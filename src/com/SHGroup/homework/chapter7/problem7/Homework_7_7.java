package com.SHGroup.homework.chapter7.problem7;

import com.SHGroup.homework.HomeworkClass;

import java.util.HashMap;
import java.util.Vector;

public class Homework_7_7 extends HomeworkClass {
    /*
        아래의 HV 클래스는 해쉬맵을 인자로 받아 벡터를 리턴하는 hashToVector() 메소드를 가지고 있다.
        이 메소드는 해쉬맵 내의 '값(value)' 을 모두 Vector<String>에 삽입하여 리턴한다.
        hashToVector()를 작성하라.
     */

    public final static Vector<String> hashToVector(final HashMap<String, String> h){
        return new Vector<String>(h.values());
    }

    public final void run() {
        HashMap<String, String> h = new HashMap<String, String>();

        h.put("범죄", "112");
        h.put("화재", "119");
        h.put("전화번호", "114");

        Vector<String> v = Homework_7_7.hashToVector(h);
        for(int n  = 0 ; n < v.size(); n ++){
            System.out.println(v.get(n));
        }
    }
}
