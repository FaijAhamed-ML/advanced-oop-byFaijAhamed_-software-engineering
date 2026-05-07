package lab09.q5;

public class PermanentEmployee extends Employee implements Payable {
    private double monthlySalary;

    public PermanentEmployee(String empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void generatePayslip() {
        System.out.println("--- Payslip: Permanent Employee ---");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Net Salary  : Rs. " + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
