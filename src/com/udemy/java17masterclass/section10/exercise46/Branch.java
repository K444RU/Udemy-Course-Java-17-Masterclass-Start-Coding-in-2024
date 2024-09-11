package java17masterclass.section10.exercise46;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if (findCustomer(nameOfCustomer) != null) {
            return false;
        }
        Customer newCustomer = new Customer(nameOfCustomer, initialTransaction);
        customers.add(newCustomer);
        return true;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for (Customer customer : customers) {
            if (customer.getName().equals(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double initialTransaction) {
        Customer customer = findCustomer(nameOfCustomer);
        if (customer != null) {
            customer.addTransaction(initialTransaction);
            return true;
        }
        return false;
    }
}
