package BaiTap3.B1;

public class Manager extends Employee {
    private int phuCap;


    public Manager(int salary, int phuCap) {
        super(salary);
        this.phuCap = phuCap;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + phuCap;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "phuCap=" + phuCap +
                '}';
    }
}
