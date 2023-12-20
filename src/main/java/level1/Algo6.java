package level1;

public class Algo6 {
    public int solution(int[][] sizes){
        int answer = 0;
        int max_x = 0;
        int max_y= 0;
        for (int[] size : sizes) {
            int x = Math.max(size[0], size[1]);
            int y = Math.min(size[0], size[1]);
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
        }
        answer = max_x*max_y;
        return answer;

    }

    public static void main(String[] args) {
        int[][] size = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Algo6 algo = new Algo6();
        System.out.println(algo.solution(size));
    }
}
