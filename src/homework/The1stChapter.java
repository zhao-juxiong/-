package homework;

public class The1stChapter {
    public static String DecimalToBinaryByRecursion(int num) {
        int quotient = num / 2;
        int remainder = num % 2;
        String result = "";
        if (quotient == 0) {
            return result + remainder;
        }
        return DecimalToBinaryByRecursion(quotient) + remainder;
    }
}
