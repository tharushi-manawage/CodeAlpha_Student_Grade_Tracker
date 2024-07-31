import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
    private ArrayList<Double> grades;

    public GradeCalculator() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double getHighestGrade() {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public double getLowestGrade() {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t+-------------------------------------------------------------------+");
		System.out.println("\t|\t\t\tSTUDENT GRADE TRACKER\t\t\t    |");
		System.out.println("\t+-------------------------------------------------------------------+");

        System.out.print("\n\tEnter the number of students in the class : ");
        int num = scanner.nextInt();
        
        System.out.println("\n\tEnter grade for,");

        for (int i = 0; i < num; i++) {
            System.out.print("\tStudent " + (i + 1) + " : ");
            double grade = scanner.nextDouble();
            calculator.addGrade(grade);
        }

        System.out.println("\n\tAverage Grade : " + calculator.calculateAverage());
        System.out.println("\tHighest Grade : " + calculator.getHighestGrade());
        System.out.println("\tLowest Grade  : " + calculator.getLowestGrade());
    }
}