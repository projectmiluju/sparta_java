package level2;

public class Algo72 {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {

        int start = toSecond(h1,m1,s1);
        int end = toSecond(h2,m2,s2);

        return cal(end) - cal(start) + (alarmNow(start)? 1:0);
    }
    static int cal(int time){
        int sm = time*59/3600;

        int sh = time*719/43200;

        int a = 43200 <= time ? 2 : 1;

        return sm+sh - a;
    }

    static int toSecond(int h,int m,int s){
        return h*3600+m*60+s;
    }
    static boolean alarmNow(int time){
        return time*59%3600==0 || time*719%43200==0;
    }

    public static void main(String[] args) {
        Algo72 algo72 = new Algo72();

        int answer1 = algo72.solution(0,5,30,0,7 ,0);
        System.out.println(answer1);
        int result1 = 2;
        if (result1 == answer1) System.out.println("Y"); else System.out.println("N");

        int answer2 = algo72.solution(12,0,0,12,0,30);
        int result2 = 1;
        System.out.println(answer2);
        if (result2 == answer2) System.out.println("Y"); else System.out.println("N");

        int answer3 = algo72.solution(0,6,1,0,6,6);
        int result3 = 0;
        System.out.println(answer3);
        if (result3 == answer3) System.out.println("Y"); else System.out.println("N");

        int answer4 = algo72.solution(11,59,30,12,0,0);
        int result4 = 1;
        System.out.println(answer4);
        if (result4 == answer4) System.out.println("Y"); else System.out.println("N");

        int answer5 = algo72.solution(11,58,59,11,59,0);
        int result5 = 1;
        System.out.println(answer5);
        if (result5 == answer5) System.out.println("Y"); else System.out.println("N");

        int answer6 = algo72.solution(1,5,5,1,5,6);
        int result6 = 2;
        System.out.println(answer6);
        if (result6 == answer6) System.out.println("Y"); else System.out.println("N");

        int answer7 = algo72.solution(0,0,0,23,59,59);
        int result7 = 2852;
        System.out.println(answer7);
        if (result7 == answer7) System.out.println("Y"); else System.out.println("N");
    }
}
