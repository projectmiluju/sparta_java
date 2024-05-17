package level1;

public class Algo36 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Algo36 algo36 = new Algo36();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String result = "happy";
        String answer = algo36.solution(s, skip, index);
        System.out.println(answer);
        if (answer.equals(result)) System.out.println("Y"); else System.out.println("N");
    }
}
