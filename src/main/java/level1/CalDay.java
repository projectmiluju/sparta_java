package level1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalDay {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a ,b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return answer;
    }

    public static void main(String[] args){
        CalDay solution = new CalDay();
        System.out.println(solution.solution(5,24));
    }
}
