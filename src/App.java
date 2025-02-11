import java.util.Scanner;
public class App {
      //making a change to push to git  
    public static void main(String[] args) {
            System.out.println("******* STUDENT GRADE CALCULATOR *******");
            Scanner scanner = new Scanner(System.in);
            String message="";
            System.out.println("Enter the number of subjects:");
            int num_subjects = scanner.nextInt();
            int[] subject_Marks = new int[num_subjects];
            int totalMarks = 0;
    
            for (int i = 0; i < num_subjects; i++) {
                System.out.println("Enter the marks obtained in subject " + (i + 1) + " out of 100 :");
                subject_Marks[i] = scanner.nextInt();
                totalMarks += subject_Marks[i];
            }
    
            double averagePercentage = (double) totalMarks / num_subjects;
            String grade;
    
            if (averagePercentage >= 90) {
                grade = "A";
                message="Student has passed the exam in Distinction. ";
            } else if (averagePercentage >= 80) {
                grade = "B";
                message="Student has passed the exam in First Class. ";
            } else if (averagePercentage >= 65) {
                grade = "C";
                message="Student has passed the exam in Second Class.";
            } else if (averagePercentage >= 50) {
                grade = "D";
                message="Student has Passed the exam.";
            } else {
                grade = "F";
                message="Student has Failed the exam.";
            }

            System.out.println("*** STUDENT PERFORMANCE ***");
            System.out.println("Total Marks Scored: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println(message);
    
            scanner.close();
        }
    }