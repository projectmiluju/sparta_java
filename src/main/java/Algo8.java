public class Algo8 {
    public int solution(String s){
        int answer = 0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i = 0; i<arr.length; i++){
            if (s.contains(arr[i])){
                s=s.replace(arr[i], Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Algo8 algo = new Algo8();
        System.out.println(algo.solution("one4seveneight"	));
        System.out.println(algo.solution("23four5six7"	));
        System.out.println(algo.solution("2three45sixseven"	));
        System.out.println(algo.solution("123"	));

    }
}
