

class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean prime = number > 1;

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}

public class Q23 {
    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        p.checkPrime(17);

        System.out.println("Total Prime Checks: " +
                           PrimeChecker.totalPrimeChecks);
    }
}
