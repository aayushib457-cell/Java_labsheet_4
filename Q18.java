

class ElectricBill {
    int units;
    static double fixedCharge = 50;

    void calculateBill() {
        double energyCharge;

        if (units <= 100) {
            energyCharge = units * 2;
        } else if (units <= 200) {
            energyCharge = 100 * 2 + (units - 100) * 3;
        } else {
            energyCharge = 100 * 2 + 100 * 3 +
                           (units - 200) * 5;
        }

        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }
}

public class Q18 {
    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();

        e.units = 150;
        e.calculateBill();
    }
}
