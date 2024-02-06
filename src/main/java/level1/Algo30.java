package level1;

import java.util.Objects;

public class Algo30 {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        String match = "[^0-9a-z-_.]";
        new_id = new_id.replaceAll(match,"");

        if (new_id.isEmpty()){
            new_id += "a";
        }

        String new_id_id = "";
        new_id_id += new_id.charAt(0);
        int idx = 0;
        if (new_id.length() > 2) {
            for (int i = 1; i < new_id.length(); i++) {
                if (new_id_id.charAt(idx) == '.' && new_id.charAt(i) != '.') {
                    new_id_id += new_id.charAt(i);
                    idx++;
                } else if (new_id_id.charAt(idx) != '.') {
                    new_id_id += new_id.charAt(i);
                    idx++;
                }
            }
        }
        if (new_id_id.charAt(0) == '.'){
            new_id_id = new_id_id.replaceFirst(".","");
        }

        if (new_id_id.isEmpty()){
            new_id_id += "a";
        }

        if (new_id_id.charAt(new_id_id.length()-1) == '.'){
            new_id_id = new_id_id.substring(0,new_id_id.length()-1);
        }

        if (new_id_id.length() >= 16){
            new_id_id = new_id_id.substring(0,15);
            if (new_id_id.charAt(new_id_id.length()-1) == '.'){
                new_id_id = new_id_id.substring(0,new_id_id.length()-1);
            }
        }
        if (new_id_id.length() <= 2){
            new_id_id += new_id_id.charAt(new_id_id.length()-1);
            if (new_id_id.length() <= 2){
                new_id_id += new_id_id.charAt(new_id_id.length()-1);
            }
        }
        answer += new_id_id;
        return answer;
    }

    public static void main(String[] args) {
        Algo30 algo = new Algo30();

        String id1 = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        System.out.println(algo.solution(id1));
        if (Objects.equals(algo.solution(id1), result)){
            System.out.println("Y");
        }


//        String id2 = "z-+.^.";
//        System.out.println(algo.solution(id2)); // z--
//
        String id3 = "=.=";
        System.out.println(algo.solution(id3)); // aaa
//
//        String id4 = "123_.def";
//        System.out.println(algo.solution(id4)); // 123_.def
//
//        String id5 = "abcdefghijklmn.p";
//        System.out.println(algo.solution(id5)); // abcdefghijklmn



    }
}
