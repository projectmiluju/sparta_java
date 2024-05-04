package level2;

public class Algo46 {
    public int solution(String[][] relation) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Algo46 algo46 = new Algo46();

        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        int res = 2;
        System.out.println(algo46.solution(relation));
        if (algo46.solution(relation) == res) System.out.println("Y"); else System.out.println("N");
    }
}
