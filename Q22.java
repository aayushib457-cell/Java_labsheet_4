

class Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        totalChecks++;

        if (original >= 0 && sum == original) {
            System.out.println(original + " is Armstrong");
        } else {
            System.out.println(original + " is Not Armstrong");
        }
    }
}

public class Q22 {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();

        a.checkArmstrong(153);

        System.out.println("Total Checks: " + Armstrong.totalChecks);
    }
}
