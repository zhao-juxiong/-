package lr1;
import java.time.Year;
public class Example12 {
    public static Year calculateBirthyear(int age){
        Year currenYear = Year.now();
        Year birthYear = currenYear.minusYears(age);
        return birthYear;
    }

    public static void main(String[] args) {
        int age = 21;
        Year birthYear = calculateBirthyear(age);
        System.out.println("год рождения:" + birthYear);
    }
}