public class StrToInt {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args){
        StrToInt solution = new StrToInt();
        System.out.println(solution.solution("-2345"));
    }
}
