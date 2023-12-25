package level1;

import java.util.Arrays;

public class Algo15 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i = 0; i<photo.length; i++){
            for (int j = 0; j<photo[i].length; j++){
                for (int k = 0; k<name.length; k++){
                    if (photo[i][j].equals(name[k])){
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo15 algo = new Algo15();
        String[] a = {"may", "kein", "kain", "radi"};
        int[] b = {5, 10, 1, 3};
        String[][] c = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(algo.solution(a, b, c)));
    }
}
