

class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    void calculateGrade() {
        String grade;

        if (marks < passingMarks) {
            grade = "Fail";
        } else if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Q17 {
    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();

        s.name = "Aman";
        s.marks = 85;

        s.calculateGrade();
    }
}
