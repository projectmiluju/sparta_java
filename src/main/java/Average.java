public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        answer = sum / arr.length ;
        return answer;
    }

    public static void main(String[] args){
        int[] s = {1,2,3,4};
        Average solution = new Average();
        System.out.println(solution.solution(s));
    }

}
