import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double highest = 0;
        double lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();

            total = total + grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / 10;

        System.out.println("Average: " + average);
        System.out.println("Maximum: " + highest);
        System.out.println("Minimum: " + lowest);

        scanner.close();
    }
}