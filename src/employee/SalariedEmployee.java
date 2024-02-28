package employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary<0.0) throw new IllegalArgumentException("weekly salary must be grater than 0.0");
    }

    @Override
    public double getPayment() {
        return 0;
    }
}
