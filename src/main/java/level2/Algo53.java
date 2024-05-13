package level2;

public class Algo53 {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Algo53 algo53 = new Algo53();

        String skill = "CBD";
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        int res = 2;
        int answer = algo53.solution(skill, skill_trees);
        System.out.println(answer);
        if (answer == res) System.out.println("Y"); else System.out.println("N");
    }
}
