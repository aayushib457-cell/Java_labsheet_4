

class Employee {
    int empId;
    double salary;
    static String companyName = "TCS";

    void display() {
        int id = empId;
        double pay = salary;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + pay);
        System.out.println("Company: " + companyName);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.empId = 101;
        e.salary = 35000;

        e.display();
    }
}
