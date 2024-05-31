package level3;

public class Algo7 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0, sIdx = 0, i = 1;

        while (i <= n) {
            if (sIdx < stations.length && i >= stations[sIdx] - w) {
                i = stations[sIdx] + w + 1;
                sIdx++;
                continue;
            }

            i += 2 * w + 1;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo7 algo7 = new Algo7();

        int N1 = 11, W1 = 1, res1 = 3;
        int[] stations1 = {4 ,11};
        int ans1 = algo7.solution(N1, stations1, W1);
        System.out.println(ans1);
        if (ans1 == res1) System.out.println("Y"); else System.out.println("N");

        int N2 = 16, W2 = 2, res2 = 3;
        int[] stations2 = {9};
        int ans2 = algo7.solution(N2, stations2, W2);
        System.out.println(ans2);
        if (ans2 == res2) System.out.println("Y"); else System.out.println("N");
    }
}
