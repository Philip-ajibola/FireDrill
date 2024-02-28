package employee;

public class HourlyEmployee extends Employee{
    private double wages;
    private int hour;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wages,int hour) {
        super(firstName, lastName, socialSecurityNumber);
        if(wages<=0.0)throw new IllegalArgumentException("wages must be greater than 0.0");
        if(hour<=0 || hour>168) throw new IllegalArgumentException("hour must be greater than 0");
        this.hour = hour;
        this.wages = wages;
    }

    @Override
    public double getPayment() {
        if(hour<40) return getWages()*getHour();
        else return 40 * getWages() + (getHour() - 40) * getWages() * 1.5;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<=0 || hour>168) throw new IllegalArgumentException("hour must be greater than 0");
        this.hour = hour;
    }

    public double getWages() {
        if(wages<=0.0)throw new IllegalArgumentException("wages must be greater than 0.0");
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
    public String toString(){
        return String.format("Hourly Employee \n%s \n Hour of Work: %d \n wages: %.2f",super.toString(),getHour(),getWages());
    }
}
