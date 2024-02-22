import javax.swing.text.DateFormatter;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FireDrillSeven2 {
    private static LocalDate currentDate;
    private static LocalDate birthday;
    public static int getAge(String dateOfBirth){
        currentDate = LocalDate.now();
        birthday = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period checkPeriod = Period.between(birthday,currentDate);
        return checkPeriod.getYears();
    }

}
