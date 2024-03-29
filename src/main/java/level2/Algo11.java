package level2;

import java.util.Arrays;

public class Algo11 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;
        for (int i = people.length -1; i >= index; i--){
            if (people[i] + people[index] <= limit ){
                index ++;
            }
            answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo11 algo = new Algo11();
        int[] n = {70, 50, 80, 50};
        int[] m = {70, 80, 50};
        int limit = 100;
        System.out.println(algo.solution(n, limit));
        System.out.println(algo.solution(m, limit));
    }
}
