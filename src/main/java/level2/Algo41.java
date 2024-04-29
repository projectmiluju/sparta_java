package level2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Algo41 {

    static HashMap<Integer, List<Integer>> map;

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        map = new HashMap<>();
        for (int i = 1; i < rows+1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j < columns + 1; j++) {
                if (i == 1){
                    list.add(j);
                }else list.add(columns*(i-1) + j);
            }
            map.put(i, list);
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = cal(queries[i]);
            System.out.println(map);
        }
        return answer;
    }

    public int cal(int[] query){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < query[2]-query[0]; i++) {
            List<Integer> beforeList = map.get(query[0]+i);

            List<Integer> afterList = new ArrayList<>(beforeList);

            for (int j = 0; j < query[3] - query[1]; j++) {
                if (i == 0){
                    //첫번째 꼭짓점
                    if (j == 0){
                        min = beforeList.get(query[1]-1);
                        afterList.set(query[1]-1, map.get(query[0]+i+1).get(query[1]-1));
                    }
                    //첫째줄
                    else  {
                        min = Math.min(min, beforeList.get(query[1]+j-1));
                        afterList.set(query[1]+j-1, beforeList.get(query[1]+j-2));

                    }
                }else if (i == query[2]-query[0]-1){
                    // 마지막 꼭짓점
                    if (j == query[3]-query[1]-1){
                        min = Math.min(min, beforeList.get(query[3]-1));
                        afterList.set(query[3]-1, map.get(query[0]+i-1).get(query[3]-1));
                    }
                    //마지막줄
                    else {
                        min = Math.min(min, beforeList.get(query[1]+j-1));
                        afterList.set(query[1]+j-1, beforeList.get(query[1]+j));

                    }
                }else {
                    //첫번째 세로줄
                    if (j == 0) {
                        min = Math.min(min, beforeList.get(query[1]-1));
                        afterList.set(query[1]-1,map.get(query[0]+i+1).get(query[1]-1));
                    }
                    //두번째 세로줄
                    else {
                        min = Math.min(min, beforeList.get(query[3]-1));
                        afterList.set(query[3]-1,map.get(query[0]+i-1).get(query[3]-1));

                    }
                }
            }
            map.put(query[0]+i, afterList);
        }
        return min;
    }

    public static void main(String[] args) {
        Algo41 algo41 = new Algo41();

//        int row1 = 6, column1 = 6;
//        int[][] queries1 = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
//        int[] result1 = {8, 10, 25};
//        System.out.println(Arrays.toString(algo41.solution(row1, column1, queries1)));
//        if (Arrays.equals(algo41.solution(row1, column1, queries1),result1)) System.out.println("Y"); else System.out.println("N");

        int row2 = 3, column2 = 3;
        int[][] queries2 = {{1, 1, 2, 2},{1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}};
        int[] result2 = {1, 1, 5, 3};
        System.out.println(Arrays.toString(algo41.solution(row2, column2, queries2)));
        if (Arrays.equals(algo41.solution(row2, column2, queries2),result2)) System.out.println("Y"); else System.out.println("N");

//        int row3 = 100, column3 = 97;
//        int[][] queries3 = {{1, 1, 100, 97}};
//        int[] result3 = {1};
//        System.out.println(Arrays.toString(algo41.solution(row3, column3, queries3)));
//        if (Arrays.equals(algo41.solution(row3, column3, queries3),result3)) System.out.println("Y"); else System.out.println("N");
    }
}
