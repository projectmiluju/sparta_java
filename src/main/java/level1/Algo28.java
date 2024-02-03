package level1;

public class Algo28 {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];
        int n = 0;
        int idx = 0;
        String numstr = "";
        for (int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c>='0'&&c<='9'){
                numstr += String.valueOf(c);
            } else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(numstr);
                if (c == 'S'){
                    dart[idx] = (int)Math.pow(n,1);
                } else if (c == 'D') {
                    dart[idx] = (int)Math.pow(n,2);
                } else {
                    dart[idx] = (int)Math.pow(n,3);
                }
                idx++;
                numstr = "";
            } else {
                if (c == '*'){
                    dart[idx-1]*=2;
                    if (idx-2>=0) dart[idx-2]*=2;
                }else dart[idx-1]*=(-1);
            }
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }

    public static void main(String[] args) {
        Algo28 algo = new Algo28();

        String a1 = "1S2D*3T";
        System.out.println(algo.solution(a1)); // 37

        String a2 = "1D2S#10S";
        System.out.println(algo.solution(a2)); // 9

        String a3 = "1D2S0T";
        System.out.println(algo.solution(a3)); // 3

        String a4 = "1S*2T*3S";
        System.out.println(algo.solution(a4)); // 23

        String a5 = "1D#2S*3S";
        System.out.println(algo.solution(a5)); // 5

        String a6 = "1T2D3D#";
        System.out.println(algo.solution(a6)); // -4

        String a7 = "1D2S3T*";
        System.out.println(algo.solution(a7)); // 59
    }
}
