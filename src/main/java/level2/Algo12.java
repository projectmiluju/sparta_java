package level2;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

public class Algo12 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            list.add(words[i]);
            if(i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algo12 algo = new Algo12();
        int n = 3;
        String[] word1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        // [3,3]
        int m = 5;
        String[] word2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        // [0,0]
        int y = 2;
        String[] word3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        // [1,3]
        System.out.println(Arrays.toString(algo.solution(n, word1)));
        System.out.println(Arrays.toString(algo.solution(m, word2)));
        System.out.println(Arrays.toString(algo.solution(y, word3)));
    }
}
