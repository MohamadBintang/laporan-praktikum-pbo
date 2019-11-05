
public class PermanentEmployee1841720007Bintang extends Employee1841720007Bintang
        implements Payable1841720007Bintang {

    private int salary;

    public PermanentEmployee1841720007Bintang(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryBintang() {
        return salary;
    }

    public void setSalaryBintang(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountBintang() {
        return (int) (salary + 0.05 + salary);
    }

    @Override
    public String getEmployeeInfoBintang() {
        String info = super.getEmployeeInfoBintang() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
