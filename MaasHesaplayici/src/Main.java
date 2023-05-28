public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000.0, 45, 1985);

        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculateTax(emp.getSalary());

        BonusCalculator bonusCalculator = new BonusCalculator();
        double bonus = bonusCalculator.calculateBonus(emp.getWorkHours());

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double salaryIncrease = salaryCalculator.calculateSalaryIncrease(emp.getStartYear(), emp.getSalary());

        double totalSalary = emp.getSalary() + bonus - tax + salaryIncrease;

        System.out.println(emp.toString());
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + salaryIncrease);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + (emp.getSalary() + totalSalary));
    }
}
