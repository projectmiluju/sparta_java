package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Algo63 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, (o1, o2) -> o1[col-1] != o2[col-1] ? o1[col-1] - o2[col-1] : o2[0] - o1[0]);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = row_begin-1; i < row_end; i++){
            int sum = 0;
            for (int j = 0; j < data[0].length; j++){
                sum += data[i][j] % (i+1);
            }
            list.add(sum);
        }
        answer = list.get(list.get(0));
        for (int i = 1; i < list.size(); i++){
            answer ^= list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo63 a = new Algo63();

        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        int result = 4;
        int answer = a.solution(data, col, row_begin, row_end);
        System.out.println(answer);
        if (result == answer) System.out.println("Y"); else System.out.println("N");
    }
}
