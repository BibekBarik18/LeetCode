import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the DayOfWeek enum from the date
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // Return the day of the week as a String
        return dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase(); 
    }
}
