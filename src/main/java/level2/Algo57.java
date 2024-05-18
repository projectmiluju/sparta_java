package level2;

import java.util.HashMap;

public class Algo57 {

    static HashMap<Integer,Integer> map;
    public int solution(int[] elements) {
        int answer = 0;
        // 증복 제거 원소 개수 총합 구하기
        // elements의 길이만큼
        map = new HashMap<>();
        for (int i = 0; i < elements.length; i++){
            int n = i+1;
            elementSum(n,elements);
        }
        answer = map.size();
        return answer;
    }

    private void elementSum(int n, int[] elements){

        int[] arr = new int[elements.length+elements.length];
        System.arraycopy(elements,0,arr,0,elements.length);
        System.arraycopy(elements, 0,arr, elements.length, elements.length);

        for (int i = 0; i < elements.length; i++){
            int sum = 0;
            for (int j = i; j < n + i; j++){
                sum += arr[j];
            }
            map.put(sum,1);
        }
    }


    public static void main(String[] args) {
        Algo57 algo57 = new Algo57();

        int[] elements = new int[]{7,9,1,1,4};
        int result = 18;
        int answer = algo57.solution(elements);
        System.out.println(answer);
        if (result == answer) System.out.println("Y"); else System.out.println("N");
    }
}
