import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjectCount = scanner.nextInt();

        int[] scores = new int[subjectCount];
        int aggregateMarks = 0;

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            aggregateMarks += scores[i];
        }

        double averagePercentage = (double) aggregateMarks / subjectCount;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + aggregateMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}