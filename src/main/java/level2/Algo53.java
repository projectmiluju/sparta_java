package level2;


public class Algo53 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            skill_trees[i] = skill_trees[i].replaceAll("[^"+skill+"]","");
            boolean flag = false;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.charAt(j) != skill_trees[i].charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                answer++;
            }
        }
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
