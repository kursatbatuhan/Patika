public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1500, 45, 2015);

        System.out.println(employee.toString());
        System.out.println("Tax: " + employee.tax() + " TL");
        System.out.println("Bonus: " + employee.bonus() + " TL");

        employee.raiseSalary();
        System.out.println("New Salary: " + employee.getSalary() + " TL");
    }
}