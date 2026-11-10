

class Factorial {
    static int totalCalls = 0;

    void calculateFactorial(int number) {
        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        totalCalls++;

        System.out.println("Factorial: " + factorial);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.calculateFactorial(5);

        System.out.println("Total Calls: " + Factorial.totalCalls);
    }
}
