package level2;

public class Algo74 {
    public int solution(String[] maps) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        Algo74 algo74 = new Algo74();

        String[] map1 = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        int res1 = 16;
        int ans1 = algo74.solution(map1);
        System.out.println(ans1);
        if (res1 == ans1) System.out.println("Y"); else System.out.println("N");

        String[] map2 = {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
        int res2 = -1;
        int ans2 = algo74.solution(map2);
        System.out.println(ans2);
        if (res2 == ans2) System.out.println("Y"); else System.out.println("N");
    }
}
