package level1;

import java.util.Arrays;

public class ElementZero {
    public int[] solution(int[] arr, int divisor) {

        int j = 0;

        for(int i= 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){

                j++;
            }
        }

        int[] answer = new int[j];
        j = 0 ;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){

                answer[j] = arr[i];

                j++;
            }
        }

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args){
        int[] a = {5,6,7,10};
        int b = 5;

        ElementZero solution = new ElementZero();
        System.out.println(Arrays.toString(solution.solution(a,b)));

    }
}
