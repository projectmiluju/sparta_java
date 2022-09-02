import java.util.HashSet;

//프로그래머스lv1 폰켓몬
public class Ponketmon {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        if (numsSet.size() > answer) {
            return answer;
        } else {
            return numsSet.size();
        }
    }

    public static void main(String[] args) {
        int[] s = {4,4,4,4,4,4};
        Ponketmon solution = new Ponketmon();
        System.out.println(solution.solution(s));

    }
}
