package level2;

import java.util.Objects;

public class Algo45 {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        return answer;
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
