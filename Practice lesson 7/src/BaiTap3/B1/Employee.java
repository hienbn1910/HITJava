package BaiTap3.B1;

public abstract class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
