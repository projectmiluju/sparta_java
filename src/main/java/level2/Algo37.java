package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Algo37 {
    public String[] solution(String[] files) {
        String[] answer = {};

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                int result = head1.toLowerCase().compareTo(head2.toLowerCase());

                if (result == 0) {
                    result = convertNum(o1,head1) - convertNum(o2,head2);
                }
                return result;
            }
        });

        return files;
    }

    public int convertNum(String str, String head) {
        str = str.substring(head.length());

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)) && result.length() < 5) {
                result += str.charAt(i);
            }else break;
        }
        return Integer.parseInt(result);
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
