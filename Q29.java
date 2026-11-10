

class Employee {
    String name;
    double salary;

    static String organization = "Infosys";

    void compareSalary(Employee e) {
        double salary1 = this.salary;
        double salary2 = e.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2) {
            System.out.println(name + " has higher salary");
        } else if (salary1 < salary2) {
            System.out.println(e.name + " has higher salary");
        } else {
            System.out.println("Both have equal salaries");
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e1.salary = 50000;

        e2.name = "Aman";
        e2.salary = 40000;

        e1.compareSalary(e2);
    }
}
