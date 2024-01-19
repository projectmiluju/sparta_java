package level2;

import java.util.Stack;

public class Algo9 {

    public int solution(String s)
    {
        char[] s2 = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s2.length; i++){
            char c = s2[i];

            if (stack.isEmpty()) stack.push(c);

            else {
                if (stack.peek() == c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1:0;
    }

    public static void main(String[] args) {
        Algo9 algo = new Algo9();
        String s = "baabaa";
        String t = "cdcd";
        System.out.println(algo.solution(s));
        System.out.println(t);
    }
}
