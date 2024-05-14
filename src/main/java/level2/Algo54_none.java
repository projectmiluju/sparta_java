package level2;

public class Algo54_none {
    public int solution(String dirs) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algo54_none algo54 = new Algo54_none();

        String dir1 = "ULURRDLLU";
        int res1 = 7;
        int ans1 = algo54.solution(dir1);
        System.out.println(ans1);
        if (ans1 == res1) System.out.println("Y"); else System.out.println("N");

        String dir2 = "LULLLLLLU";
        int res2 = 7;
        int ans2 = algo54.solution(dir2);
        System.out.println(ans2);
        if (ans2 == res2) System.out.println("Y"); else System.out.println("N");
    }
}
