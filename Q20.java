

class BankAccount {
    double balance;
    static String bankCode = "SBI001";

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.balance = 10000;

        System.out.println("Bank Code: " + BankAccount.bankCode);
        b.withdraw(3000);
    }
}
