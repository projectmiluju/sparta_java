import java.util.Arrays;

public class Sum{
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i = 0; i<arr1.length; i++ ){
            for(int j = 0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{3,4},{5,6}};
        Sum solution = new Sum();
        System.out.println(Arrays.deepToString(solution.solution(a,b)));
    }
}