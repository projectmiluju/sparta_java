package level1;

public class Middle {
    public String solution(String s) {
        String answer ;

        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        }
        else{
            answer = s.substring(s.length()/2 , s.length()/2 + 1);
        }
        return answer;
    }

    public static void main(String[] args){
        String s = "abcde";
        Middle solution = new Middle();
        System.out.println(solution.solution(s));

    }

}

