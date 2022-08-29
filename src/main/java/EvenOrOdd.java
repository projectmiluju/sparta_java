public class EvenOrOdd {

    public String evenorodd(int num) {
        String answer = "";

        if(num % 2 == 0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenorodd = new EvenOrOdd();

        System.out.println(evenorodd.evenorodd(2));

    }
}