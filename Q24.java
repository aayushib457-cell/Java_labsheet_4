

class Fibonacci {
    static int seriesCount = 0;

    void displaySeries(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        seriesCount++;
        System.out.println();
    }
}

public class Q24 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        f.displaySeries(10);

        System.out.println("Total Series: " + Fibonacci.seriesCount);
    }
}
