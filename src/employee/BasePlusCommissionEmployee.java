package employee;

public class BasePlusCommissionEmployee extends CommisionEmployee {
    public double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0.0");
         this.baseSalary = baseSalary;
    }
}
