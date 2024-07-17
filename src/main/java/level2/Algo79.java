package level2;

public class Algo79 {
    static boolean[] visited;
    static int count;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return count;
    }

    private void dfs(int depth, int fatigue, int[][] dungeons){
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }
            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        count = Math.max(count, depth);
    }

    public static void main(String[] args) {
        Algo79 algo79 = new Algo79();

        int k = 80;
        int[][] dungeons = {{80,20}, {50, 40}, {30, 10}};
        int result = 3;
        int answer = algo79.solution(k, dungeons);
        System.out.println(answer);
        if (result == answer) System.out.println("Y"); else System.out.println("N");
    }
}
