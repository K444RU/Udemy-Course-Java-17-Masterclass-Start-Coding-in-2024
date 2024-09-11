package java17masterclass.section10.exercise46;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) != null) {
            return false;
        }
        branches.add(new Branch(nameOfBranch));
        return true;
    }

    private Branch findBranch(String nameOfBranch) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(nameOfBranch)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomer(String nameOfTheBranch, String nameOfTheCustomer, double initialTransaction) {
        Branch branch = findBranch(nameOfTheBranch);
        if (branch != null) {
            return branch.newCustomer(nameOfTheCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfTheBranch, String nameOfTheCustomer, double transaction) {
        Branch branch = findBranch(nameOfTheBranch);
        if (branch != null) {
            return branch.addCustomerTransaction(nameOfTheCustomer, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
