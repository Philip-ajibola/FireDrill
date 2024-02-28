package employee;

public class BasePlusCommissionEmployee extends CommisionEmployee {
    public double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return super.getPayment() + getBaseSalary();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public String toString(){
        return String.format("BasePlusCommissionEmployee: \n %s \n %.2f",super.toString(),getPayment());
    }
}
