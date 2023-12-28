package level1;

import java.util.HashSet;

public class Algo18 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> numset = new HashSet<>();
        for (int num : nums){
            numset.add(num);
        }
        if (numset.size() > max){
            return max;
        } else {
            return numset.size();
        }
    }

    public static void main(String[] args) {
        Algo18 algo = new Algo18();
        System.out.println(algo.solution(new int[]{3, 1, 2, 3}));
    }
}

