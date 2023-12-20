package level1;

public class StringTF {
    public boolean solution(String s) {
        boolean answer = true;

        int i = s.length();
        if(i != 4 && i != 6 ){
            return false;
        }
        for(int j=0; j<i ; j++){
            char c = s.charAt(j);
            if(c<'0' || c>'9'){
                return false;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        StringTF method = new StringTF();
        System.out.println(method.solution("a234"));
    }
}
