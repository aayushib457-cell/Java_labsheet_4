

class StringReverse {
    static int totalReversals = 0;

    void reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        totalReversals++;

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}

public class Q27 {
    public static void main(String[] args) {
        StringReverse s = new StringReverse();

        s.reverseString("Java");

        System.out.println("Total Reversals: " +
                           StringReverse.totalReversals);
    }
}
