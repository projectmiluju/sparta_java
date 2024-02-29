package level2;

public class Algo26 {
    public String solution(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};

        int num = n;

        while (num > 0){
            int a = num % 3;
            num = num / 3;
            if (a == 0) num--;

            answer = numbers[a] + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo26 algo = new Algo26();
        System.out.println(algo.solution(1)); //1
        System.out.println(algo.solution(2)); //2
        System.out.println(algo.solution(3)); //4
        System.out.println(algo.solution(4)); //11
        System.out.println(algo.solution(5)); //12
        System.out.println(algo.solution(6)); //14
        System.out.println(algo.solution(7)); //21
        System.out.println(algo.solution(8)); //22
        System.out.println(algo.solution(9)); //24
        System.out.println(algo.solution(10)); //41
        System.out.println(algo.solution(11)); //42
        System.out.println(algo.solution(12)); //44
        System.out.println(algo.solution(13)); //111
        System.out.println(algo.solution(14)); //112
        System.out.println(algo.solution(15)); //114
        System.out.println(algo.solution(16)); //121




    }
}
