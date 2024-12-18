import java.time.LocalDate;
import java.time.Period;

public class BirthdateCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2006, 8, 11);  // Example birthdate
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        
        System.out.println("Age: " + period.getYears() + " years, " + 
                           period.getMonths() + " months, and " + 
                           period.getDays() + " days.");
    }
}
