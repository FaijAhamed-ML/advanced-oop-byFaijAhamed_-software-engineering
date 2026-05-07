package lab09.q5;

public class ContractEmployee extends Employee implements Payable {
    private double paidHourly;
    private int houredWorked;

    public ContractEmployee(String empId, String name, double paidHourly,int HoursWorking) {
        super(empId, name);
        this.paidHourly = paidHourly;
        this.houredWorked= HoursWorking;
    }

    @Override
    public void generatePayslip() {
        System.out.println("--- Payslip: Contract Employee ---");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Hours Worked: " + houredWorked + " hrs");
        System.out.println("Hourly Rate : Rs. " + paidHourly);
        System.out.println("Net Salary  : Rs. " + calculateSalary());

    }

    @Override
    public double calculateSalary() {
        return houredWorked*paidHourly;
    }
}
