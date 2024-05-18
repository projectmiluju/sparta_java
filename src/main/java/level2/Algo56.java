package level2;

import java.util.Arrays;

public class Algo56 {

    static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        int totalSize = arr.length;
        dp(0,0,totalSize,arr);

        return answer;
    }

    private static boolean check(int x, int y, int size, int[][] arr){
        for (int i = x; i < x + size; i++){
            for (int j = y; j < y + size; j++){
                if (arr[x][y] != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void dp(int startX, int startY, int size, int[][] arr){
        if (check(startX, startY, size, arr)){
            answer[arr[startX][startY]]++;
            return;
        }
        dp(startX, startY, size / 2, arr);
        dp(startX + size / 2, startY, size / 2, arr);
        dp(startX, startY + size / 2, size / 2, arr);
        dp(startX + size / 2, startY + size / 2, size / 2, arr);
    }

    public static void main(String[] args) {
        Algo56 algo56 = new Algo56();

        int[][] arr1 = {{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}};
        int[] res1 = {4, 9};
        int[] ans1 = algo56.solution(arr1);
        System.out.println(Arrays.toString(ans1));
        if (Arrays.equals(res1, ans1)) System.out.println("Y"); else System.out.println("N");

        int[][] arr2 = {{1,1,1,1,1,1,1,1}, {0,1,1,1,1,1,1,1}, {0,0,0,0,1,1,1,1}, {0,1,0,0,1,1,1,1}, {0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1}, {0,0,0,0,1,0,0,1}, {0,0,0,0,1,1,1,1}};
        int[] res2 = {10, 15};
        int[] ans2 = algo56.solution(arr2);
        System.out.println(Arrays.toString(ans2));
        if (Arrays.equals(res2, ans2)) System.out.println("Y"); else System.out.println("N");
    }
}
