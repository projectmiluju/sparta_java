package level1;

import java.util.*;
import java.util.stream.Collectors;

public class Algo13 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<numbers.length; i++){
            for (int j = 1; j<numbers.length; j++){
                if (i != j) {
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(arr);
        List<Integer> newList = arr.stream().distinct().collect(Collectors.toList());;
//        Set<Integer> set = new HashSet<>(arr);
//        Integer[] set2 = set.toArray(new Integer[0]);
        Integer[] set2 = newList.toArray(new Integer[0]);
        int[] answer = Arrays.stream(set2).mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Algo13 algo = new Algo13();
        System.out.println(Arrays.toString(algo.solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(algo.solution(new int[]{5, 0, 2, 7})));
        System.out.println(Arrays.toString(algo.solution(new int[]{1,2,6,10,13,20})));

    }
}
