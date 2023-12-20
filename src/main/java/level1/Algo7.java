package level1;

// 아스키코드를 알아야 한다
public class Algo7 {
    public String solution(String s, int n){
        String answer = "";
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)){
                ch = (char)((ch -'A' + n) % 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }

//    public String solution(){
//        String answer = "";
//        char ch1 = 'a';
//        char ch2 = 'b';
//        answer += ch1;
//        answer += ch2;
//        return answer;
//    }

    public static void main(String[] args) {
        Algo7 algo = new Algo7();
        System.out.println(algo.solution("AB",1));
        System.out.println(algo.solution("z",1));
        System.out.println(algo.solution("a B z",4));
//        System.out.println(algo.solution());
//        char ch1 = 'a';
//        char ch2 = 'b';
//        System.out.println(ch1 + ch2);
    }
}
