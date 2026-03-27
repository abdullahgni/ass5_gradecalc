public class CalculateGrade {
    public static void main(String[] args) {
        System.out.print("Enter marks (0 - 100): ");
        int marks = 84;
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else if (marks >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered!");
            return;
        }

        System.out.println("Grade: " + grade);

    }
}