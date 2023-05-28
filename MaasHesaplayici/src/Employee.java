import java.time.Year;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int startYear;

    public Employee(String name, double salary, int workHours, int startYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startYear = startYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getStartYear() {
        return startYear;
    }

    public String toString() {
        return "Adı: " + name + "\n"
                + "Maaşı: " + salary + "\n"
                + "Çalışma Saati: " + workHours + "\n"
                + "Başlangıç Yılı: " + startYear;
    }
}
