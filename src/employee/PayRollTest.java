package employee;

public class PayRollTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
                new CommisionEmployee("Sue", "Jones", "333-33-3333", 10000, .1),
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300)
        };

        for(Payable payable: payableObjects){
            System.out.println(payable);
            if(payable instanceof BasePlusCommissionEmployee payableEmployee){
                payableEmployee.setBaseSalary(1.10 * payableEmployee.getBaseSalary());
                System.out.printf("new BasePlusCommissionEmployee Increased with 10%% is : %.2f\n",payableEmployee.getBaseSalary());
            }
            System.out.printf("Earnings : $%,.2f\n", payable.getPayment());
            System.out.println();
        }
    }
}
