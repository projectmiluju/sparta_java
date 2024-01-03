package level1;

public class Algo24 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;

        for (int i : section){
            if (i > index){
                answer++;
                index = i + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo24 algo = new Algo24();
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(algo.solution(n,m,section));
    }
}
