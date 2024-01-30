package level2;

public class Algo14 {
    public int solution(int[] arr) {
        int answer = 0;

        if (arr.length == 1) return arr[0];
        int a = gcd(arr[0],arr[1]);
        answer = (arr[0]*arr[1]) / a;

        if (arr.length > 2){
            for (int i = 2; i < arr.length; i++){
                a = gcd(answer, arr[i]);
                answer = (answer*arr[i]) / a;
            }
        }

        return answer;
    }

    //최대 공약수 구하기
    private static int gcd(int a, int b){
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b,r);
    }

    public static void main(String[] args) {
        Algo14 algo = new Algo14();
        int[] arr1 = {2,6,8,14};
        int[] arr2 = {2,5};
        System.out.println(algo.solution(arr1));
        System.out.println(algo.solution(arr2));

    }
}
