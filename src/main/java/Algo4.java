public class Algo4 {
    public int solution(String t, String p){
        int answer  = 0;
        if (t.length() <= p.length()){
            if (Integer.parseInt(t) <= Integer.parseInt(p)){
                answer = 1;
            }
        }
        else {
            for (int i = 0; i < t.length(); i++){
                String str = t.substring(i,p.length()+i);
                if (Integer.parseInt(str) <= Integer.parseInt(p)){
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String x = "3141592";
        String y = "271";
        Algo4 solution = new Algo4();
        System.out.println(solution.solution(x, y));
    }
}