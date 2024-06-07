package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo68 {
    static int sum=0;

    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[i].length(); j++) {
                dfs(maps, visited, i, j);
                if(sum>0) {
                    list.add(sum);
                    sum=0;
                }
            }
        }
        if(list.isEmpty()) return new int[] {-1};

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public void dfs(String[] maps, boolean[][] visited, int i, int j) {
        if(i<0 || j<0 || i>=maps.length || j>=maps[0].length()) return;
        if(maps[i].charAt(j) == 'X' || visited[i][j]) return;
        else {
            visited[i][j]=true;
            sum+=maps[i].charAt(j)-'0';
        }
        dfs(maps, visited, i+1, j);
        dfs(maps, visited, i-1, j);
        dfs(maps, visited, i, j+1);
        dfs(maps, visited, i, j-1);
    }

    public static void main(String[] args) {
        Algo68 algo68 = new Algo68();

        String[] map1 = {"X591X","X1X5X","X231X", "1XXX1"};
        int[] res1 = {1, 1, 27};
        int[] ans1 = algo68.solution(map1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        String[] map2 = {"XXX", "XXX", "XXX"};
        int[] res2 = {-1};
        int[] ans2 = algo68.solution(map2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
