package lr1;
import java.time.LocalDate;
import java.time.Period;

public class Example10 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2003,01,17);
        LocalDate currenDate = LocalDate.now();
        Period period = Period.between(birthDate,currenDate);
        int age = period.getYears();
        System.out.println("возраст:" + age + "лет");
    }
}
