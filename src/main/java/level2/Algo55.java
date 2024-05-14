package level2;

public class Algo55 {
    public String solution(String number, int k) {

        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] arr = number.toCharArray();

        int len = arr.length - k;

        int start = 0;

        for (int i = 0; i < len; i++){
            char max = '0';
            for (int j = start; j <= i + k; j++){
                if (arr[j] > max){
                    max = arr[j];
                    start = j+1;
                }
            }
            sb.append(Character.toString(max));
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Algo55 algo55 = new Algo55();

        String num1 = "1924";
        int a = 2;
        String res1 = "94";
        String ans1 = algo55.solution(num1, a);
        System.out.println(ans1);
        if (res1.equals(ans1)) System.out.println("Y"); else System.out.println("N");

        String num2 = "1231234";
        int b = 3;
        String res2 = "3234";
        String ans2 = algo55.solution(num2, b);
        System.out.println(ans2);
        if (res2.equals(ans2)) System.out.println("Y"); else System.out.println("N");

        String num3 = "4177252841";
        int c = 4;
        String res3 = "775841";
        String ans3 = algo55.solution(num3, c);
        System.out.println(ans3);
        if (res3.equals(ans3)) System.out.println("Y"); else System.out.println("N");
    }
}
