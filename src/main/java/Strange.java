public class Strange{
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split("");
        int st = 0;

        for(int i = 0 ; i<ss.length; i++){
            if(ss[i].equals(" ")){
                st = 0;
            } else if (st % 2 == 0) {
                ss[i] = ss[i].toUpperCase();
                st++;
            } else{
                ss[i] = ss[i].toLowerCase();
                st++;
            }
            answer += ss[i];
        }
        return answer;
    }

    public static void main(String[] args){
        String s = "try hello world";
        Strange method = new Strange();
        System.out.println(method.solution(s));
    }
}
