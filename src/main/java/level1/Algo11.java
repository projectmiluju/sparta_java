package level1;

public class Algo11 {
    public String solution(int[] food){
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i< food.length; i++){
            if ( food[i] == 1){
                arr.append(0);
            }else if (food[i] % 2 == 0){
                for (int j = 0; j<food[i]/2; j++){
                    arr.append(i);
                }
            }else {
                for (int j = 0; j<food[i]/2; j++){
                    arr.append(i);
                }
            }
        }
        String str = arr.toString().replaceAll("0","");

        StringBuffer strings = new StringBuffer(str);
        String reverse = strings.reverse().toString();

        String answer = str + "0" + reverse;

        return answer;
    }

    public static void main(String[] args) {
        Algo11 algo = new Algo11();

        System.out.println(algo.solution(new int[]{1, 3, 4, 6}));
        System.out.println(algo.solution(new int[]{1, 7, 1, 2}));

    }
}
