package level2;

public class Algo26 {
    public String solution(int n) {
        StringBuilder sol = new StringBuilder();
        int a = n / 3;
        int b = n % 3;
        if (n == 1){
            sol.append("1");
            return sol.toString();
        }
        if (n == 2){
            sol.append("2");
            return sol.toString();
        }
        if (n == 3){
            sol.append("4");
            return sol.toString();

        }else {
//            while (a >= 0) {
//                if (b == 0) {
//                    answer += "4";
//                    if (a == 2) {
//                        return answer + "1";
//                    }
//                    if (a == 3) {
//                        return answer + "2";
//                    }
//                    a = (a / 3) - 1;
//                    b = a % 3;
//                } else {
//                    answer += Integer.toString(b);
//                    if (a == 1){
//                        return answer + "1";}
//                    if (a == 2) {
//                        return answer + "2";
//                    }
//                    if (a == 3) {
//                        return answer + "4";
//                    }
//                    a = a / 3;
//                    b = a % 3;
//                }
            while (a >= 0) {
                if (b == 0) {
                    sol.append("4");
                    if (a == 2) {
                        sol.append("1");
                        StringBuilder sb = new StringBuilder(sol.toString());
                        return sb.reverse().toString();
                    }
                    if (a == 3) {
                        sol.append("2");
                        StringBuilder sb = new StringBuilder(sol.toString());
                        return sb.reverse().toString();
                    }
                    a = (a / 3) - 1;
                    b = a % 3;
                } else {
                    sol.append(b);
                    if (a == 1){
                        sol.append("1");
                        StringBuilder sb = new StringBuilder(sol.toString());
                        return sb.reverse().toString();
                    }
                    if (a == 2) {
                        sol.append("2");
                        StringBuilder sb = new StringBuilder(sol.toString());
                        return sb.reverse().toString();
                    }
                    if (a == 3) {
                        sol.append("4");
                        StringBuilder sb = new StringBuilder(sol.toString());
                        return sb.reverse().toString();
                    }
                    a = a / 3;
                    b = a % 3;
                }
            }
        }
        StringBuilder sb = new StringBuilder(sol.toString());
        return sb.reverse().toString();
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
        System.out.println(algo.solution(15)); //111


    }
}
