
class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        count++;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        String studentName = "Rahul";
        int studentAge = 20;

        s1.name = studentName;
        s1.age = studentAge;

        s2.name = "Aman";
        s2.age = 21;

        s1.display();
        s2.display();

        System.out.println("Total Students: " + Student.count);
    }
}
