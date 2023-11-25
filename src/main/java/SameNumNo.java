import java.util.ArrayList;
import java.util.Arrays;

//같은 숫자는 싫어 프로그래머스lv1
public class SameNumNo {  //커밋 테스트중
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (i == arr.length - 2) {
                    list.add(arr[i + 1]);
                }
                continue;
            } else {
                list.add(arr[i]);
                if (i==arr.length-2){
                    list.add(arr[i+1]);
                }

            }
        }
        answer = new int[list.size()];
        for (int i =0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] s = {1, 1, 1, 3, 2, 4, 4};
        SameNumNo solution = new SameNumNo();
        System.out.println(Arrays.toString(solution.solution(s)));
    }
}
