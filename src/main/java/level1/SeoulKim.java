package level1;

public class SeoulKim {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("kim")){
                answer = "김서방은 "+ i + "에 있다";
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String[] seoul = {"jane","kim"};
        SeoulKim method = new SeoulKim();
        System.out.println(method.solution(seoul));
    }
}
