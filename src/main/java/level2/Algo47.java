package level2;

public class Algo47 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;


        int d = 0;
        int p = 0;
        for(int i=n-1; i>=0; i--){
            d -= deliveries[i];
            p -= pickups[i];

            while(d < 0 || p < 0){
                d += cap;
                p += cap;
                answer += (i+1)*2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo47 algo47 = new Algo47();

        int cap1 = 4;
        int a = 5;
        int[] deliveries1 = {1, 0, 3, 1, 2};
        int[] pickups1 = {0, 3, 0, 4, 0};
        int res1 = 16;
        long ans1 = algo47.solution(cap1, a, deliveries1, pickups1);
        System.out.println(ans1);
        if (ans1 == res1) System.out.println("Y"); else System.out.println("N");

        int cap2 = 2;
        int b = 7;
        int[] deliveries2 = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups2 = {0, 2, 0, 1, 0, 2, 0};
        int res2 = 30;
        long ans2 = algo47.solution(cap2, b, deliveries2, pickups2);
        System.out.println(ans2);
        if (ans2 == res2) System.out.println("Y"); else System.out.println("N");
    }
}
