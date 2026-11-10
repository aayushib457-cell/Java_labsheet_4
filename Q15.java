

class SimpleInterest {
    double principal, rate, time;
    static String bank = "SBI";

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        double amount = principal + interest;

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + amount);
    }
}

public class Q15 {
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();

        s.principal = 10000;
        s.rate = 5;
        s.time = 2;

        s.calculateInterest();
    }
}
