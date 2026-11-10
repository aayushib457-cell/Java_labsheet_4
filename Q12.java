

class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "DBRAU";

    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

public class Q12 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();

        s.marks1 = 80;
        s.marks2 = 90;
        s.marks3 = 70;

        s.calculateAverage();
    }
}
