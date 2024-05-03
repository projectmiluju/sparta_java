package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Algo45 {
    public String solution(String m, String[] musicinfos) {
        String answer = "";

        m = m.replace("C#","c");
        m = m.replace("D#","d");
        m = m.replace("E#","e");
        m = m.replace("F#","f");
        m = m.replace("G#","g");
        m = m.replace("A#","a");
        m = m.replace("B#","b");

        int min = 0;
        for (int i = 0; i < musicinfos.length; i++) {
            String s = musicinfos[i];
            ArrayList<String> list = new ArrayList<>(List.of(s.split(",")));
            int time = time(list.get(0), list.get(1));
            String realPlay = realPlay(list.get(3),time);
            if (realPlay.contains(m)) {
                if (min != time){
                    if (Math.max(min, time) == time) {
                        min = time;
                        answer = list.get(2);
                    }
                }
            }
        }
        if (min == 0){
            return "(None)";
        }
        return answer;
    }

    public int time(String a, String b) {
        int a_time = (Integer.parseInt(a.split(":")[0]) * 60) + Integer.parseInt(a.split(":")[1]);
        int b_time = (Integer.parseInt(b.split(":")[0]) * 60 )+ Integer.parseInt(b.split(":")[1]);
        return b_time - a_time;
    }

    public String realPlay(String a, int time) {

        a = a.replace("C#", "c");
        a = a.replace("D#", "d");
        a = a.replace("E#", "e");
        a = a.replace("F#", "f");
        a = a.replace("G#", "g");
        a = a.replace("A#", "a");
        a = a.replace("B#", "b");
        if (time <= a.length()) {
            a = a.substring(0, time);
            return a;
        } else {
            int m = time / (a.length());
            int n = time % (a.length());
            String b = "";
            StringBuilder c = new StringBuilder(a);
            if (n != 0){
                b = a.substring(0, n);
            }
            for (int i = 1; i < m; i++) {
                c.append(a);
            }
            return c+b;
        }
    }

    public static void main(String[] args) {
        Algo45 algo45 = new Algo45();

        String a = "ABCDEFG";
        String[] musicinfos1 = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String res1 = "HELLO";
        System.out.println(algo45.solution(a, musicinfos1));
        if (Objects.equals(algo45.solution(a, musicinfos1), res1)) System.out.println("Y"); else System.out.println("N");

        String b = "CC#BCC#BCC#BCC#B";
        String[] musicinfos2 = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        String res2 = "FOO";
        System.out.println(algo45.solution(b, musicinfos2));
        if (Objects.equals(algo45.solution(b, musicinfos2), res2)) System.out.println("Y"); else System.out.println("N");

        String c = "ABC";
        String[] musicinfos3 = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String res3 = "WORLD";
        System.out.println(algo45.solution(c, musicinfos3));
        if (Objects.equals(algo45.solution(c, musicinfos3), res3)) System.out.println("Y"); else System.out.println("N");
    }
}
