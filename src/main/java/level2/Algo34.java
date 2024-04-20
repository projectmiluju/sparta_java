package level2;

import java.util.ArrayList;

public class Algo34 {
    public int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toLowerCase();
        ArrayList<String> str1_list = new ArrayList<>();
        str2 = str2.toLowerCase();
        ArrayList<String> str2_list = new ArrayList<>();
        for (int i = 0; i < str1.length()-1; i++) {
            String a = str1.substring(i,i+1) + str1.substring(i+1,i+2);
            a = a.replaceAll("[^a-zA-Z]", "");
            if (a.length() == 2) {
                str1_list.add(a);
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            String a = str2.substring(i,i+1) + str2.substring(i+1,i+2);
            a = a.replaceAll("[^a-zA-Z]", "");
            if (a.length() == 2) {
                str2_list.add(a);
            }
        }
        int a = str1_list.size();
        int b = str2_list.size();
        if (a +b == 0) return  65536;
        int min = 0;
        int max = 0;
        for (int i = 0; i < str1_list.size(); i++) {
            for (int j = 0; j < str2_list.size(); j++) {
                if (str1_list.get(i).equals(str2_list.get(j))) {
                    min++;
                    str2_list.remove(j);
                    break;
                }
            }
        }
        if (min == 0){
            return 0;
        }

        max = a + b - min;

        if (max == 0) {
            return 65536;
        }
        answer = ((double) min / (double) max) * 65536;

        return (int)answer;
    }

    public static void main(String[] args) {
        Algo34 algo34 = new Algo34();

        System.out.println(algo34.solution("FRANCE", "french"));
        int result = 16384;
        if (algo34.solution("FRANCE", "french") == result) System.out.println("Y"); else System.out.println("N");

        System.out.println(algo34.solution("handshake", "shake hands"));
        int result2 = 65536;
        if (algo34.solution("handshake", "shake hands") == result2) System.out.println("Y"); else System.out.println("N");
//
        System.out.println(algo34.solution("aa1+aa2", "AAAA12"));
        int result3 = 43690;
        if (algo34.solution("aa1+aa2", "AAAA12") == result3) System.out.println("Y"); else System.out.println("N");
//
        System.out.println(algo34.solution("E=M*C^2", "e=m*c^2"));
        int result4 = 65536;
        if (algo34.solution("E=M*C^2", "e=m*c^2") == result4) System.out.println("Y"); else System.out.println("N");

        System.out.println(algo34.solution("A+C","DEF"));
        int result5 = 0;
        if (algo34.solution("A+C","DEF") == result5) System.out.println("Y"); else System.out.println("N");
    }
}
