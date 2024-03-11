package level2;

public class Algo27 {

    public int solution(String s) {

        int answer = Integer.MAX_VALUE;

        if (s.length() == 1) return 1;

        for (int i = 1; i <= s.length() / 2; i++){
            StringBuffer sb = new StringBuffer();
            String str = "";
            int count = 1;

            for (int j = 0; j <= s.length() - i; j += i){
                String curStr = s.substring(j, j + i);

                if (str.equals(curStr)){
                    count++;
                    continue;
                }else if (count > 1){
                    sb.append(count + str);
                    count = 1;
                }else {
                    sb.append(str);
                }

                str = curStr;
            }

            sb.append(count > 1 ? count + str : str);

            if (s.length() % i != 0){
                sb.append(s.substring(s.length() - s.length() % i, s.length()));
            }

            answer = Math.min(answer,sb.length());

        }

        return answer;
    }

    public static void main(String[] args) {
        Algo27 algo = new Algo27();

        System.out.println(algo.solution("aabbaccc")); //7
        System.out.println(algo.solution("ababcdcdababcdcd")); //9
        System.out.println(algo.solution("abcabcdede")); //8
        System.out.println(algo.solution("abcabcabcabcdededededede")); //14
        System.out.println(algo.solution("xababcdcdababcdcd")); //17


    }
}
