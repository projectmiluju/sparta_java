public class Test {
    public int solution(int[] arr1, int[] arr2){
        int answer = 0;
        int sum1 = 0;
        for(int i = 0; i<arr2.length;i++){
            if(arr2[i]<29){
                sum1 += arr2[i];
            }else{
                sum1 += 21;
            }
        }
        int sum2 = 0;
        for(int j =0 ; j<arr1.length; j++){
            sum2 += arr1[j];
        }
        answer = sum1-sum2;
        return answer;
    }
    public static void main(String[] args){
        Test method = new Test();
        int[] arr1 = {9,9,9,9,7,9,8};
        int[] arr2 = {23,23,30,28,30,23,23};
        System.out.println(method.solution(arr1,arr2));
    }
}
