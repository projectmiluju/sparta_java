package level1;

// 다시 풀것
import java.util.Arrays;
public class Algo12 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] brr1 = new String[n];
        String[] brr2 = new String[n];
        for (int i = 0; i<n; i++){
            brr1[i] =Integer.toBinaryString(arr1[i]);
            brr2[i] =Integer.toBinaryString(arr2[i]);
            while ( brr1[i].length() < n){
                brr1[i] = "0" + brr1[i];
            }
            while ( brr2[i].length() < n){
                brr2[i] = "0" + brr2[i];
            }
        }
        String[] crr = new String[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (brr1[i].charAt(j) == '1' || brr2[i].charAt(j) == '1' ){
                    crr[i] = crr[i] + "#";
                }else {
                    crr[i] = crr[i] + " ";
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (crr[i].contains("null")){
                crr[i] = crr[i].replaceAll("null","");
            }
        }
        answer = crr;
        return answer;
    }

    public static void main(String[] args) {
        Algo12 algo = new Algo12();
        int a = 5;
        int[] b = {9, 20, 28, 18, 11};
        int[] c = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(algo.solution(a, b, c)));
    }
}
