

class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double depositAmount = amount;
        balance += depositAmount;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }
}

public class Q7 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.accountNumber = 12345;
        b.balance = 5000;

        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Account: " + b.accountNumber);

        b.deposit(2000);
    }
}
