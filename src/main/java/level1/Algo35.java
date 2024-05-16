package level1;

import java.util.Arrays;

public class Algo35 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                int sum = -1;
                for (int k = 0; k < keymap.length; k++) {
                    if (keymap[k].contains(targets[i].charAt(j) + "")) {
                        if (sum == -1 || sum > keymap[k].indexOf(targets[i].charAt(j) + "") + 1) {
                            sum = keymap[k].indexOf(targets[i].charAt(j) + "") + 1;
                        }
                    }
                }
                answer[i] += sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo35 algo35 = new Algo35();

        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};
        int[] res1 = {9, 4};
        int[] answer1 = algo35.solution(keymap1, targets1);
        System.out.println(Arrays.toString(answer1));
        if (Arrays.equals(res1,answer1)) System.out.println("Y"); else System.out.println("N");

        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};
        int[] res2 = {-1};
        int[] answer2 = algo35.solution(keymap2, targets2);
        System.out.println(Arrays.toString(answer2));
        if (Arrays.equals(res2,answer2)) System.out.println("Y"); else System.out.println("N");
//
        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA","BGZ"};
        int[] res3 = {4, 6};
        int[] answer3 = algo35.solution(keymap3, targets3);
        System.out.println(Arrays.toString(answer3));
        if (Arrays.equals(res3,answer3)) System.out.println("Y"); else System.out.println("N");
    }
}
