import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0–100): ");
        int mark = sc.nextInt();

        String grade;

        if (mark >= 90 && mark <= 100) {
            grade = "O";
        }
        else if (mark >= 80) {
            grade = "E";
        }
        else if (mark >= 70) {
            grade = "A";
        }
        else if (mark >= 60) {
            grade = "B";
        }
        else if (mark >= 50) {
            grade = "C";
        }
        else if (mark >= 0) {
            grade = "F (Fail)";
        }
        else {
            grade = "Invalid Mark";
        }

        System.out.println("\nGrade: " + grade);
    }
}
