package lab09.q5;

abstract public class Employee {
    protected String empId;
    protected String name;
    abstract public double calculateSalary();

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
