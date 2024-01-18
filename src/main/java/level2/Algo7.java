package level2;

public class Algo7 {
    public int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString(n);

        int n3 = n2.replace("0","").length();


        for (int i = n+1; i<=1000000; i ++){
            String s = Integer.toBinaryString(i);
            if ((s.replace("0","").length()) == n3){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo7 algo = new Algo7();
        int n = 78;
        int m = 15;
        System.out.println(algo.solution(n));
        System.out.println(algo.solution(m));
    }
}
