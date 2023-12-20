package level1;

public class Money {
    public long solution(int price, int money, int count) {
        long answer = 0;

        long totalPrice = (long)price*(count*(count+1)/2);

        if( totalPrice <= money ){
            answer = 0 ;
        }

        else{
            answer = totalPrice - money ;
        }
        return answer;
    }
    public static void main(String[] args){

        Money solution = new Money();
        System.out.println(solution.solution(3,20,4));
    }
}
