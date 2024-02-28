package employee;

public class CommisionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return getCommissionRate() * getGrossSales();
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }
    @Override
    public String toString(){
        return String.format("CommissionBaseEmployee: \n%s\nCommissionRate: %.2f\nGrossSale: %.2f",super.toString(),getCommissionRate(),getGrossSales());
    }
}
