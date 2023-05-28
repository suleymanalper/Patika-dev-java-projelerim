public class TaxCalculator {
    public double calculateTax(double salary) {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
}
