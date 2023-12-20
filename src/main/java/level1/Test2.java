package level1;

public class Test2 {
    public String solution(int n){
        String answer = "";
        int sum = 0;
        String str_n = Integer.toString(n);
        int[] reverse = new int[str_n.length()];
        for(int i = 0; i<str_n.length(); i++){
            sum += (str_n.charAt(i) - '0');
        }
        for(int i = 0 ; i<str_n.length(); i++){
            reverse[str_n.length()-i-1] = (str_n.charAt(i)-'0');
        }
        answer += '"';
        for(int i = 0 ; i<str_n.length()-1; i++){
            answer += reverse[i] + "+";
        }
            answer += reverse[str_n.length()-1];
            answer += "=";
            answer += sum;
            answer += '"';
        return answer;
    }
    public static void main(String[] args){
        Test2 method = new Test2();
        System.out.println(method.solution(718253));
    }
}
