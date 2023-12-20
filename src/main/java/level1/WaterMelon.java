package level1;

public class WaterMelon {
    public String solution(int n) {
        String answer = "";
        for(int i =1; i<=n; i++){
            if(i % 2 != 0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
    public static void main(String[] args){
        WaterMelon method = new WaterMelon();
        System.out.println(method.solution(5));
    }
}
