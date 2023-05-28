import java.time.Year;

public class SalaryCalculator {
    public double calculateSalaryIncrease(int startYear, double salary) {
        int yearsWorked = Year.now().getValue() - startYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }
}
