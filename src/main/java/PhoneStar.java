public class PhoneStar {
    public String solution(String phone_number) {
        String answer = "";
        StringBuffer newNumber = new StringBuffer(phone_number);

        for(int i = 0; i < newNumber.length()-4; i++) {

            newNumber.setCharAt( i, '*');

        }

        answer = newNumber.toString();

        return answer;
    }
    public static void main(String[] args){
        String s = "01037415700";
        PhoneStar solution = new PhoneStar();
        System.out.println(solution.solution(s));
    }
}
