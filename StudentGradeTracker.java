import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Number of subjects must be positive.");
            input.close();
            return;
        }

        double[] marks = new double[n];
        double total = 0;

        double highest = 0;
        double lowest = 100;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject "
                    + (i + 1) + " (0-100): ");

            marks[i] = input.nextDouble();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                input.close();
                return;
            }

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = total / n;

        System.out.println("\n===== Student Report =====");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        if (average >= 80) {
            System.out.println("Grade: A+");
        } else if (average >= 70) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else if (average >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
