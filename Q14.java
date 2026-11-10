

class Person {
    String name;
    int age;
    static String country = "India";

    void checkEligibility() {
        int votingAge = 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (age >= votingAge) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Person p = new Person();

        p.name = "Rahul";
        p.age = 20;

        p.checkEligibility();
    }
}
