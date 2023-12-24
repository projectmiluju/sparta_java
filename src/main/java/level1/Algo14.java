package level1;

public class Algo14 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(true){
            if (n<a){
                break;
            }

            answer += (n/a)*b;

            n = ((n/a)*b)+(n%a);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo14 algo = new Algo14();
        System.out.println(algo.solution(2,1,20));
    }
}
