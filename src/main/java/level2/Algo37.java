package level2;

import java.util.Arrays;

public class Algo37 {
    public String[] solution(String[] files) {
        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Algo37 algo37 = new Algo37();

        String[] files1 = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] result1 = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};
        System.out.println(Arrays.toString(algo37.solution(files1)));
        if (Arrays.equals(algo37.solution(files1), result1)) System.out.println("Y"); else System.out.println("N");

        String[] files2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] result2 = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};
        System.out.println(Arrays.toString(algo37.solution(files2)));
        if(Arrays.equals(algo37.solution(files2), result2)) System.out.println("Y"); else System.out.println("N");
    }
}
