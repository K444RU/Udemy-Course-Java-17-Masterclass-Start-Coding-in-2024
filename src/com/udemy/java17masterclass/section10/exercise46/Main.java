package java17masterclass.section10.exercise46;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);

        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.listCustomers("Adelaide", true);

        bank.listCustomers("Adelaide", false);
    }
}
