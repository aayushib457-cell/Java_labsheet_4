

class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + os);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Laptop l = new Laptop();

        l.brand = "HP";
        l.RAM = 8;

        l.display();
    }
}
