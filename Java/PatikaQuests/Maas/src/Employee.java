public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private final int CURRENT_YEAR = 2021;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double getSalary() {
        return salary;
    }
    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        int extraHours = workHours - 40;
        if (extraHours <= 0) {
            return 0;
        } else {
            return extraHours * 30;
        }
    }

    public void raiseSalary() {
        int yearsOfWork = CURRENT_YEAR - hireYear;
        if (yearsOfWork < 10) {
            salary *= 1.05;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    public String toString() {
        return "Name: " + name + "\nSalary: " + salary + " TL\nWork Hours: " + workHours + "\nHire Year: " + hireYear;
    }
}